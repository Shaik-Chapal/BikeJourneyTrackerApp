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
data class StationModel(
    val adress: String,
    val fid: Int,
    val id: Int,
    val kapasiteet: Int,
    val kaupunki: String,
    val name: String,
    val namn: String,
    val nimi: String,
    val operaattor: String,
    val osoite: String,
    val stad: String,
    val x: Double,
    val y: Double
)
