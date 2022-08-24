package com.example.weather

import com.example.weather.models.CurrentWeather
import com.example.weather.models.Units
import com.example.weather.network.WeatherAPI
import kotlinx.coroutines.runBlocking

object WeatherData {

    fun getWeatherForToday(
        latitude: Int,
        longitude: Int
    ): String {
        return runBlocking {
            return@runBlocking fetchCurrentWeatherData(latitude, longitude).weather[0].description
        }
    }

    fun getTemperatureForToday(
        latitude: Int,
        longitude: Int,
        units: Units
    ): Double {
        return runBlocking {
            return@runBlocking fetchCurrentWeatherData(latitude, longitude, units).main.temp
        }
    }

    fun getWindSpeedForToday(
        latitude: Int,
        longitude: Int
    ): Double {
        return runBlocking {
            return@runBlocking fetchCurrentWeatherData(latitude, longitude).wind.speed
        }
    }

    private fun fetchCurrentWeatherData(
        latitude: Int,
        longitude: Int,
        units: Units = Units.DEFAULT
    ): CurrentWeather {
        return runBlocking {
            return@runBlocking WeatherAPI.retrofitService.fetchCurrentWeatherData(
                latitude,
                longitude,
                units.param
            )
        }
    }
}