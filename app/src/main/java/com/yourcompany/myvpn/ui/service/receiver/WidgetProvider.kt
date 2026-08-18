package com.yourcompany.myvpn.receiver

import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews
import com.yourcompany.myvpn.R
import com.yourcompany.myvpn.service.V2RayVpnService

class WidgetProvider : AppWidgetProvider() {
    override fun onUpdate(context: Context, appWidgetManager: android.appwidget.AppWidgetManager, appWidgetIds: IntArray) {
        for (appWidgetId in appWidgetIds) {
            val views = RemoteViews(context.packageName, R.layout.widget_layout)
            views.setOnClickPendingIntent(R.id.widget_switch, getPendingIntent(context))
            appWidgetManager.updateAppWidget(appWidgetId, views)
        }
    }

    private fun getPendingIntent(context: Context): android.app.PendingIntent {
        val intent = Intent(context, V2RayVpnService::class.java)
        intent.action = V2RayVpnService.ACTION_START
        return android.app.PendingIntent.getService(context, 0, intent, android.app.PendingIntent.FLAG_IMMUTABLE)
    }
}
