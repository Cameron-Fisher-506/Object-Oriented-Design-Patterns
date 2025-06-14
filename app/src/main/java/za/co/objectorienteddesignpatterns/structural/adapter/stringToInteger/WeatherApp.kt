package za.co.objectorienteddesignpatterns.structural.adapter.stringToInteger

class WeatherApp: IAnalyticsService {
    override fun trackAnalytics(weatherString: String) {
        println("Weather String: $weatherString")
    }
}