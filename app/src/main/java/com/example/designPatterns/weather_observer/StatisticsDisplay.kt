package com.example.designPatterns.weather_observer

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.designPatterns.weather_observer.custom.DisplayElement

class StatisticsDisplay : Fragment(), DisplayElement {

    private var temperature : Float = 0f
    private var humidity : Float = 0f
    private lateinit var model : StatisticsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        model = ViewModelProviders.of(this).get(StatisticsViewModel::class.java)

        val temperatureObserver = androidx.lifecycle.Observer<Float> {
            temperature = it
            display()
        }
        val humidityObserver = androidx.lifecycle.Observer<Float> {
            humidity = it
            display()
        }
        val pressureObserver = androidx.lifecycle.Observer<Float> {
        }
        model.temperature.observe(this, temperatureObserver)
        model.humidity.observe(this, humidityObserver)
        model.pressure.observe(this, pressureObserver)
    }

    override fun display() = println("Current Conditions: ${temperature}F degress and ${humidity}% humidity")
}