package za.co.objectorienteddesignpatterns.structural.adapter.stringToInteger

class StringToIntAdapter: IAnalyticsService {
    private val adaptee: AnalyticsService = AnalyticsService()

    override fun trackAnalytics(weatherString: String) {
        adaptee.trackAnalytics(weatherString.toInt())
    }
}