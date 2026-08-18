plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.jaredsburrows.license")
}

fun getVersionNameFromGit(): String {
    return try {
        val process = ProcessBuilder("git", "describe", "--tags", "--abbrev=0", "--match", "v*").start()
        val version = process.inputStream.bufferedReader().readText().trim().removePrefix("v")
        if (version.isEmpty()) "1.0.0" else version
    } catch (e: Exception) { "1.0.0" }
}

fun getVersionCodeFromGit(): Int {
    return try {
        val process = ProcessBuilder("git", "rev-list", "--count", "HEAD").start()
        val count = process.inputStream.bufferedReader().readText().trim().toIntOrNull()
        count ?: 1
    } catch (e: Exception) { 1 }
}

android {
    namespace = "com.yourcompany.myvpn"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.yourcompany.myvpn"
        minSdk = 24
        targetSdk = 36
        versionCode = getVersionCodeFromGit()
        versionName = getVersionNameFromGit()
        multiDexEnabled = true

        val abiFilterList = (properties["ABI_FILTERS"] as? String)?.split(';')
        splits {
            abi {
                isEnable = true
                reset()
                if (abiFilterList != null && abiFilterList.isNotEmpty()) {
                    include(*abiFilterList.toTypedArray())
                } else {
                    include("arm64-v8a", "armeabi-v7a", "x86_64", "x86")
                }
                isUniversalApk = abiFilterList.isNullOrEmpty()
            }
        }

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    flavorDimensions.add("distribution")
    productFlavors {
        create("fdroid") {
            dimension = "distribution"
            applicationIdSuffix = ".fdroid"
            buildConfigField("String", "DISTRIBUTION", "\"F-Droid\"")
        }
        create("playstore") {
            dimension = "distribution"
            buildConfigField("String", "DISTRIBUTION", "\"Play Store\"")
        }
    }

    sourceSets {
        getByName("main") {
            jniLibs.srcDirs("libs")
        }
    }

    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlin {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
        }
    }

    applicationVariants.all {
        val variant = this
        val isFdroid = variant.productFlavors.any { it.name == "fdroid" }
        if (isFdroid) {
            val versionCodes = mapOf("armeabi-v7a" to 2, "arm64-v8a" to 1, "x86" to 4, "x86_64" to 3, "universal" to 0)
            variant.outputs.map { it as com.android.build.gradle.internal.api.ApkVariantOutputImpl }.forEach { output ->
                val abi = output.getFilter("ABI") ?: "universal"
                output.outputFileName = "myvpn_${variant.versionName}-fdroid_${abi}.apk"
                if (versionCodes.containsKey(abi)) {
                    output.versionCodeOverride = (100 * variant.versionCode + versionCodes[abi]!!).plus(5000000)
                }
            }
        } else {
            val versionCodes = mapOf("armeabi-v7a" to 4, "arm64-v8a" to 4, "x86" to 4, "x86_64" to 4, "universal" to 4)
            variant.outputs.map { it as com.android.build.gradle.internal.api.ApkVariantOutputImpl }.forEach { output ->
                val abi = output.getFilter("ABI") ?: "universal"
                output.outputFileName = "myvpn_${variant.versionName}_${abi}.apk"
                if (versionCodes.containsKey(abi)) {
                    output.versionCodeOverride = (1000000 * versionCodes[abi]!!).plus(variant.versionCode)
                }
            }
        }
    }

    buildFeatures {
        viewBinding = true
        buildConfig = true
    }

    packaging {
        jniLibs {
            useLegacyPackaging = true
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.aar", "*.jar"))))

    // AndroidX Core
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.preference.ktx)
    implementation(libs.recyclerview)
    implementation(libs.androidx.swiperefreshlayout)
    implementation(libs.androidx.viewpager2)
    implementation(libs.androidx.fragment)

    // UI
    implementation(libs.material)
    implementation(libs.toasty)
    implementation(libs.editorkit)
    implementation(libs.flexbox)

    // Storage & Networking
    implementation(libs.mmkv.static)
    implementation(libs.gson)
    implementation(libs.okhttp)

    // Coroutines
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.coroutines.core)

    // Language
    implementation(libs.language.base)
    implementation(libs.language.json)

    // QR & Intents
    implementation(libs.quickie.foss)
    implementation(libs.core)

    // Lifecycle
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.runtime.ktx)

    // WorkManager
    implementation(libs.work.runtime.ktx)
    implementation(libs.work.multiprocess)

    // Multidex
    implementation(libs.multidex)

    // Xray core via JitPack
    implementation("com.github.2dust:AndroidLibXrayLite:latest")

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    testImplementation(libs.org.mockito.mockito.inline)
    testImplementation(libs.mockito.kotlin)

    coreLibraryDesugaring(libs.desugar.jdk.libs)
}
