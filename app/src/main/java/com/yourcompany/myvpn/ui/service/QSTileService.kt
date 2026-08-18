package com.yourcompany.myvpn.service

import android.service.quicksettings.TileService
import android.content.Intent

class QSTileService : TileService() {
    override fun onClick() {
        super.onClick()
        val intent = Intent(this, V2RayVpnService::class.java)
        intent.action = if (isLocked()) V2RayVpnService.ACTION_STOP else V2RayVpnService.ACTION_START
        startService(intent)
    }
}
