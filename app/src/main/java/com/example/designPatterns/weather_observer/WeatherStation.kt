package com.example.designPatterns.weather_observer

class WeatherStation {
    fun execute() {
        val weatherData: WeatherData =
            WeatherData()

        CurrentConditionsDisplay(
            weatherData
        )
//        StatisticsDisplay(weatherData)
//        ForecastDisplay(weatherData)

        weatherData.setMeasurements(80f, 65f, 30.4f)
        weatherData.setMeasurements(82f, 70f, 29.2f)
        weatherData.setMeasurements(78f, 90f, 29.2f)
    }
}