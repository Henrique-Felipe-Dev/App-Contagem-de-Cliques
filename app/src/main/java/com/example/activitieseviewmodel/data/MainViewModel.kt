package com.example.activitieseviewmodel.data

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var number = 0

    fun addNumber(){
        number++
    }

    fun resetNumber(){
        number = 0
    }

}