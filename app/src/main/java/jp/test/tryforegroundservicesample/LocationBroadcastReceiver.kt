package jp.test.tryforegroundservicesample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class LocationBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val targetIntent = Intent(context, LocationService::class.java)
        context.stopService(targetIntent)
    }
}