package com.template

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class AppService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        Log.d("Service", "onBind() called")
        TODO("Not yet implemented")
    }

    override fun onTaskRemoved(rootIntent: Intent) {
        super.onTaskRemoved(rootIntent);



        val model = MyModel.getInstance(applicationContext) // Mevcut modele erişir

        Log.d("Service", "onTaskRemoved() called")
        model.clearAll()

        // Handle app closure actions here
        // Save user progress
        // Stop background tasks
        // Update user's online status
        // Stop the service to conserve resources


    }
}
