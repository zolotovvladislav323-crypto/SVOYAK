package com.yourcompany.myvpn.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

class V2RayTestService : Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Тестовая логика
        return START_NOT_STICKY
    }
    override fun onBind(intent: Intent?): IBinder? = null
}
