package com.example.weatherapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.weather.WeatherData
import com.example.weather.models.Units

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.textView).text =
            WeatherData.getTemperatureForToday(35, 139,Units.FAHRENHEIT).toString()
    }
}