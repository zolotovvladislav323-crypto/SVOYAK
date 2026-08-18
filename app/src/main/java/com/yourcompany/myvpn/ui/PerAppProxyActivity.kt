package com.yourcompany.myvpn.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yourcompany.myvpn.R

class PerAppProxyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_per_app_proxy)
        supportActionBar?.title = "Прокси для приложений"
    }
}
