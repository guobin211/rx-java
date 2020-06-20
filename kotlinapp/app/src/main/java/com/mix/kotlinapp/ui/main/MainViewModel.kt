package com.mix.kotlinapp.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val dataMap = mapOf<String, String>("name" to "Jack", "age" to "22")
}