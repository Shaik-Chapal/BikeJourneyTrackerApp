package xyz.summer.bikejourneytracker.data.top_departure

data class DepartureResponseItem(
    val popularity: Int,
    val stationId: Int,
    val stationName: String
)