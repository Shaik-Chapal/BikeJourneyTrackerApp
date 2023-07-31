package xyz.summer.bikejourneytracker.data.local.journey.database

import androidx.room.Database
import androidx.room.RoomDatabase
import xyz.summer.bikejourneytracker.data.local.journey.constant.JourneyDatabaseConst
import xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao
import xyz.summer.bikejourneytracker.data.local.journey.dao.StationDao
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity


@Database(
    version = JourneyDatabaseConst.VERSION,
    entities = [StationEntity::class],
    exportSchema = false
)
abstract class StationDatabase : RoomDatabase() {

    abstract fun stationDao(): StationDao
}