package xyz.summer.bikejourneytracker.data.local.journey.entitiy

import androidx.room.Entity
import androidx.room.PrimaryKey
import xyz.summer.bikejourneytracker.data.local.journey.constant.JourneyDatabaseConst

@Entity(tableName = JourneyDatabaseConst.TABLE_BEER)
data class JourneyEntity(

    @PrimaryKey
    val departure: String,
    val returnTime: String,
    val departureStationId: Int,
    val departureStationName: String,
    val returnStationId: Int,
    val returnStationName: String,
    val coveredDistance: Int,
    val durationSec: Int
)
@Entity(tableName = JourneyDatabaseConst.TABLE_STATION)
data class StationEntity(
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
