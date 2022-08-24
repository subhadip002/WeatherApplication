
Latitude and Longitude of that location need to pass as a parameter in each method

//Get Temperature in FAHRENHEIT
WeatherData.getTemperatureForToday(35, 139,Units.FAHRENHEIT).toString()

//Get Temperature in CELSIUS
WeatherData.getTemperatureForToday(35, 139,Units.CELSIUS).toString()

//Get Weather
WeatherData.getWeatherForToday(35, 139)

//Get Wind Speed
WeatherData.getWindSpeedForToday(35, 139)

You need to do exception handling where ever you will use these methods

You can directly run the JUnit test cases