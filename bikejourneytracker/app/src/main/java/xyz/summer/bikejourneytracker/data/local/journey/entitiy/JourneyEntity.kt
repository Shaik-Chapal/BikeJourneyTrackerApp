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
