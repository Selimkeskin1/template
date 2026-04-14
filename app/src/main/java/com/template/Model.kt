package com.template

import android.content.Context
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner







class MyModel private constructor ( context  : Context) : DefaultLifecycleObserver {

    private val appContext = context.applicationContext




    init {
        // Bu log sadece nesne İLK KEZ yaratıldığında basılır
        Log.d("MyModel", "NESNE YARATILDI! Adres: ${this.hashCode()}")
    }

    companion object {
        @Volatile
        private var appModelInstance: MyModel? = null

        fun getInstance(context: Context): MyModel {
            return appModelInstance ?: synchronized(this) {
                appModelInstance ?: MyModel(context.applicationContext).also {
                    appModelInstance = it
                }
            }
        }
    }



    override fun onCreate(owner: LifecycleOwner) {
        Log.d("Model", "onCreate() call");
        super.onCreate(owner)
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.d("Model", "onPause() call");
        super.onPause(owner)
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d("Model", "onDestroy() call");
        super.onDestroy(owner)
    }

    override fun onResume(owner: LifecycleOwner) {
        Log.d("Model", "onResume() call");
        super.onResume(owner)
    }

    override fun onStart(owner: LifecycleOwner) {
        Log.d("Model", "onStart() call");
        super.onStart(owner)
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.d("Model", "onStop() call");
        super.onStop(owner)
    }

    fun clearAll() {
        Log.d("Model", "clearAll() call");


        Log.d("MyModel", "Socket kapatılıyor. Adres: ${this.hashCode()}")
    }







}