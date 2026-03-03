package com.template

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyViewModel() : ViewModel() {


    fun login(username: String, token: String){
        viewModelScope.launch(Dispatchers.IO) {

            val jsonBody = "{ username: \"$username\", token: \"$token\"}"



        }

    }

    override fun onCleared() {
        super.onCleared()
        Log.d( "ViewModel", "onCleared() call"  );
    }





}