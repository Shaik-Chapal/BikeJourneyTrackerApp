package xyz.summer.bikejourneytracker.data.station

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class Station(
    @Json(name = "adress") val address: String,
    @Json(name = "fid") val fid: Int,
    @Json(name = "id") val id: Int,
    @Json(name = "kapasiteet") val kapasiteet: Int,
    @Json(name = "kaupunki") val kaupunki: String,
    @Json(name = "name") val name: String,
    @Json(name = "namn") val namn: String,
    @Json(name = "nimi") val nimi: String,
    @Json(name = "operaattor") val operaattor: String,
    @Json(name = "osoite") val osoite: String,
    @Json(name = "stad") val stad: String,
    @Json(name = "x") val x: Double,
    @Json(name = "y") val y: Double
)
