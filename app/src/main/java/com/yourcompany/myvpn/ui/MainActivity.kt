package com.yourcompany.myvpn.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.yourcompany.myvpn.R
import com.yourcompany.myvpn.service.V2RayVpnService

class MainActivity : AppCompatActivity() {

    private lateinit var btnStart: Button
    private lateinit var tvStatus: TextView
    private var isRunning = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById(R.id.btn_start)
        tvStatus = findViewById(R.id.tv_status)

        btnStart.setOnClickListener {
            if (isRunning) {
                stopVpn()
            } else {
                startVpn()
            }
        }
    }

    private fun startVpn() {
        val intent = Intent(this, V2RayVpnService::class.java)
        intent.action = V2RayVpnService.ACTION_START
        startService(intent)
        isRunning = true
        btnStart.text = "Остановить"
        tvStatus.text = "Подключено"
    }

    private fun stopVpn() {
        val intent = Intent(this, V2RayVpnService::class.java)
        intent.action = V2RayVpnService.ACTION_STOP
        startService(intent)
        isRunning = false
        btnStart.text = "Старт"
        tvStatus.text = "Отключено"
    }
}
