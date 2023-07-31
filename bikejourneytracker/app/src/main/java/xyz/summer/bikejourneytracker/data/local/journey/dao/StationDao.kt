package xyz.summer.bikejourneytracker.data.local.journey.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Upsert
import xyz.summer.bikejourneytracker.data.local.journey.constant.JourneyDatabaseConst
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity

@Dao
interface StationDao {
    @Transaction
    suspend fun insertStations(beers: List<StationEntity>, clearCache: Boolean) {
        if (clearCache) deleteAllStation()
        upsertStations(beers)
    }

    ///////////////////////////////////////////////////////////////////////////
    // UPSERT
    ///////////////////////////////////////////////////////////////////////////

    @Upsert
    suspend fun upsertStations(beers: List<StationEntity>)

    ///////////////////////////////////////////////////////////////////////////
    // DELETE
    ///////////////////////////////////////////////////////////////////////////

    @Query("DELETE FROM ${JourneyDatabaseConst.TABLE_STATION}")
    suspend fun deleteAllStation()

    ///////////////////////////////////////////////////////////////////////////
    // GET
    ///////////////////////////////////////////////////////////////////////////

    @Query("SELECT * FROM ${JourneyDatabaseConst.TABLE_STATION}")
    fun getStation(): PagingSource<Int, StationEntity>
}