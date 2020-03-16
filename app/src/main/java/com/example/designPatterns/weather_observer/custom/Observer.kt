package com.example.designPatterns.weather_observer.custom

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}