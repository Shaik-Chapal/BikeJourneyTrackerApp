package xyz.summer.bikejourneytracker.data.local.journey.database

import androidx.room.Database
import androidx.room.RoomDatabase
import xyz.summer.bikejourneytracker.data.local.journey.constant.JourneyDatabaseConst
import xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity

@Database(
    version = JourneyDatabaseConst.VERSION,
    entities = [JourneyEntity::class],
    exportSchema = false
)
abstract class JourneyDatabase : RoomDatabase() {

    abstract fun beerDao(): JourneyDao
}
