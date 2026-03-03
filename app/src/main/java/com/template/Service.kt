package com.template

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

class AppService : Service() {



    private val serviceScope = CoroutineScope(Dispatchers.IO + SupervisorJob())


    override fun onBind(intent: Intent?): IBinder? {
        Log.d("Service", "onBind() called")
        TODO("Not yet implemented")
    }

    override fun onTaskRemoved(rootIntent: Intent) {
        super.onTaskRemoved(rootIntent);
        val model = MyModel.getInstance(applicationContext) // Mevcut modele erişir

        Log.d("Service", "onTaskRemoved() called")

        serviceScope.launch {
            model.clearAll()
        }

        // Handle app closure actions here
        // Save user progress
        // Stop background tasks
        // Update user's online status
        // Stop the service to conserve resources


    }

    override fun onDestroy() {
        super.onDestroy()
        serviceScope.cancel()

    }
}
