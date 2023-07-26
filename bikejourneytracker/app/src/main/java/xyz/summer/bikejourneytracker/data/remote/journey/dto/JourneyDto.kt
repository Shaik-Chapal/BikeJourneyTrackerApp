package xyz.summer.bikejourneytracker.data.remote.journey.dto

import com.squareup.moshi.Json

//data class BeerDto(
//    @Json(name = "id") val id: Int,
//    @Json(name = "name") val name: String,
//    @Json(name = "tagline") val tagline: String,
//    @Json(name = "description") val description: String,
//    @Json(name = "first_brewed") val firstBrewed: String,
//    @Json(name = "image_url") val imageUrl: String,
//)
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Journey(
    @Json(name = "departure") val departure: String,
    @Json(name = "return") val returnTime: String,
    @Json(name = "departureStationId") val departureStationId: Int,
    @Json(name = "departureStationName") val departureStationName: String,
    @Json(name = "returnStationId") val returnStationId: Int,
    @Json(name = "returnStationName") val returnStationName: String,
    @Json(name = "coveredDistance") val coveredDistance: Int,
    @Json(name = "durationSec") val durationSec: Int
)
