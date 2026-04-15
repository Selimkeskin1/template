package com.template

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.template.ui.theme.TemplateTheme

class MainActivity : ComponentActivity() {

    private lateinit var appViewModel: MyViewModel
    private lateinit var appModel: MyModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Log.d("MainActivity", "onCreate() call");
        appViewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        appModel = MyModel.getInstance(applicationContext);

        lifecycle.addObserver(appModel)
        val intent = Intent(this, AppService::class.java)
        startService(intent)
        setContent {
            TemplateTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .fillMaxHeight()
                ) {
                    MainScreen(appViewModel)
                }
            }
        }
    }


    override fun onStop() {
        Log.d("MainActivity", "onStop() call");
        super.onStop()
    }

    override fun onResume() {
        Log.d("MainActivity", "onResume() call");
        super.onResume()
    }

    override fun onPause() {
        Log.d("MainActivity", "onPause() call");
        super.onPause()
    }

    override fun onStart() {
        Log.d("MainActivity", "onStart() call");
        super.onStart()
    }

    override fun onDestroy() {
        Log.d("MainActivity", "onDestroy() call");
        super.onDestroy()
    }


}


