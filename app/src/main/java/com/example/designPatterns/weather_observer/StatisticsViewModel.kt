package com.example.designPatterns.weather_observer

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StatisticsViewModel : ViewModel() {

    val temperature : MutableLiveData<Float> by lazy {
        MutableLiveData<Float>()
    }
    val humidity : MutableLiveData<Float> by lazy {
        MutableLiveData<Float>()
    }
    val pressure : MutableLiveData<Float> by lazy {
        MutableLiveData<Float>()
    }
}