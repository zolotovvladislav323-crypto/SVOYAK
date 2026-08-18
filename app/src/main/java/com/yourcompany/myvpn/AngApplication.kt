package com.yourcompany.myvpn

import android.app.Application
import com.tencent.mmkv.MMKV

class AngApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        MMKV.initialize(this)
        // Здесь можно инициализировать другие компоненты
    }
}
