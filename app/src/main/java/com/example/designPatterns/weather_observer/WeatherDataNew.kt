package com.example.designPatterns.weather_observer

import androidx.lifecycle.ViewModel

class WeatherDataNew {

    private var temperature : Float = 0f
    private var humidity : Float = 0f
    private var pressure : Float = 0f

    val models: ArrayList<ViewModel> = ArrayList()

    private fun measurementsChanged() {
        models.forEach {
            if(it is StatisticsViewModel) {
                it.temperature.value = temperature
                it.humidity.value = humidity
                it.pressure.value = pressure
            }
            // ...
        }
    }

    fun setMeasurements(temperature: Float, humidity : Float, pressure : Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    // ETC..
}