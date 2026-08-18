package com.yourcompany.myvpn.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yourcompany.myvpn.R

class ServerGroupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_server_group)
        supportActionBar?.title = "Группы серверов"
    }
}
