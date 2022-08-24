package com.example.weather.network

import com.example.weather.models.CurrentWeather
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
private const val API_KEY = "ae1c4977a943a50eaa7da25e6258d8b2"

internal val moshi: Moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

private val retrofit =
    Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi)).baseUrl(BASE_URL)
        .build()

internal interface WeatherAPIService {
    @GET("weather")
    suspend fun fetchCurrentWeatherData(
        @Query("lat") latitude: Int,
        @Query("lon") longitude: Int,
        @Query("units") units: String,
        @Query("appid") appid: String = API_KEY,
    ): CurrentWeather
}

internal object WeatherAPI {
    internal val retrofitService: WeatherAPIService by lazy {
        retrofit.create(WeatherAPIService::class.java)
    }
}