package com.example.designPatterns.weather_observer

import com.example.designPatterns.weather_observer.custom.Observer
import com.example.designPatterns.weather_observer.custom.Subject

class WeatherData : Subject {

    private val observers = mutableListOf<Observer>()
    private var temperature : Float = 0f
    private var humidity : Float = 0f
    private var pressure : Float = 0f

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObserver() {
        observers.forEach {
            it.update(temp = temperature, humidity = humidity, pressure = pressure)
        }
    }

    private fun measurementsChanged() {
        notifyObserver()
    }

    fun setMeasurements(temperature: Float, humidity : Float, pressure : Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    // ETC..
}