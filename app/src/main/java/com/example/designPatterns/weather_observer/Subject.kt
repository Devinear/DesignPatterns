package com.example.designPatterns.weather_observer

interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObserver()
}