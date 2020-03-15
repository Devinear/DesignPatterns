package com.example.designPatterns.weather_observer.common

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}