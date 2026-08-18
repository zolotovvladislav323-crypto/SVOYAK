package com.yourcompany.myvpn.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.yourcompany.myvpn.service.V2RayVpnService

class BootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED) {
            val serviceIntent = Intent(context, V2RayVpnService::class.java)
            context.startService(serviceIntent)
        }
    }
}
