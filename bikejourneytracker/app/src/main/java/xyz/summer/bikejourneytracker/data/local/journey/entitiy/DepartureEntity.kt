package xyz.summer.bikejourneytracker.data.local.journey.entitiy

import androidx.room.Entity
import androidx.room.PrimaryKey
import xyz.summer.bikejourneytracker.data.local.journey.constant.JourneyDatabaseConst


@Entity(tableName = JourneyDatabaseConst.TABLE_D)
data class  DepartureEntity(


    val popularity: Int,
    @PrimaryKey
    val stationId: Int,
    val stationName: String
)