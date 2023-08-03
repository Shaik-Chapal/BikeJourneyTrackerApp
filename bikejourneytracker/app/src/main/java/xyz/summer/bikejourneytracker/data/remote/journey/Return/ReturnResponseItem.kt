package xyz.summer.bikejourneytracker.data.remote.journey.Return

data class ReturnResponseItem(
    val popularity: Int,
    val stationId: Int,
    val stationName: String
)