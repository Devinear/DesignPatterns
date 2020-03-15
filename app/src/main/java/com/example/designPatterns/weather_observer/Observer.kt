package com.example.designPatterns.weather_observer

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}