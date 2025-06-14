package za.co.objectorienteddesignpatterns.structural.adapter.stringToInteger

fun main() {
    val weatherString = WeatherService.getWeatherData()

    val weatherApp = WeatherApp()
    weatherApp.trackAnalytics(weatherString)

    val stringToIntAdapter = StringToIntAdapter()
    stringToIntAdapter.trackAnalytics(weatherString)
}