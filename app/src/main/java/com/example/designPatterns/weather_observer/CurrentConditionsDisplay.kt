package com.example.designPatterns.weather_observer

class CurrentConditionsDisplay(subject: Subject) : Observer, DisplayElement {

    private var temperature : Float = 0f
    private var humidity : Float = 0f

    init {
        subject.registerObserver(this)
    }

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity

        display()
    }

    override fun display() = println("Current Conditions: ${temperature}F degress and ${humidity}% humidity")
}