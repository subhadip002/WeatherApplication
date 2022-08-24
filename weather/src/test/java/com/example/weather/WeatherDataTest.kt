package com.example.weather

import com.example.weather.models.Units
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

internal class WeatherDataTest {

    @Test
    fun getWeatherForToday() {
        assertNotNull(WeatherData.getWeatherForToday(35, 139))
    }

    @Test
    fun getTemperatureForToday() {
        assertTrue(WeatherData.getTemperatureForToday(35, 139, Units.CELSIUS) > 0)
    }

    @Test
    fun getWindSpeedForToday() {
        assertTrue(WeatherData.getWindSpeedForToday(35, 139) > 0)
    }
}