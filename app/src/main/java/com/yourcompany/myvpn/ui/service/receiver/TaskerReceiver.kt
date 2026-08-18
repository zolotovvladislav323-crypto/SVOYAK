package com.yourcompany.myvpn.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.yourcompany.myvpn.service.V2RayVpnService

class TaskerReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val serviceIntent = Intent(context, V2RayVpnService::class.java)
        serviceIntent.action = V2RayVpnService.ACTION_START
        context.startService(serviceIntent)
    }
}
