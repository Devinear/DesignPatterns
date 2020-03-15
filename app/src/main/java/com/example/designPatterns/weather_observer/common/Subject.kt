package com.example.designPatterns.weather_observer.common

import com.example.designPatterns.weather_observer.common.Observer

interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObserver()
}