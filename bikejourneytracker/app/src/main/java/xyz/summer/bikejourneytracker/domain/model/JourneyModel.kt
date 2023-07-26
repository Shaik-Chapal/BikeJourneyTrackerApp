package xyz.summer.bikejourneytracker.domain.model

data class JourneyModel(
    val departure: String,
    val returnTime: String,
    val departureStationId: Int,
    val departureStationName: String,
    val returnStationId: Int,
    val returnStationName: String,
    val coveredDistance: Int,
    val durationSec: Int
)
