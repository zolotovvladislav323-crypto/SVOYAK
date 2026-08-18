package com.yourcompany.myvpn.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import libv2ray.Libv2ray
import libv2ray.V2RayConfig
import libv2ray.V2RayPoint

class V2RayProxyOnlyService : Service() {
    private var v2rayPoint: V2RayPoint? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val config = """{"inbounds":[],"outbounds":[{"protocol":"freedom","settings":{}}]}"""
        val v2rayConfig = V2RayConfig()
        v2rayConfig.loadFromJSON(config)
        v2rayPoint = Libv2ray.newV2RayPoint(v2rayConfig, false)
        v2rayPoint?.start()
        return START_STICKY
    }

    override fun onDestroy() {
        v2rayPoint?.stop()
        super.onDestroy()
    }

    override fun onBind(intent: Intent?): IBinder? = null
}
