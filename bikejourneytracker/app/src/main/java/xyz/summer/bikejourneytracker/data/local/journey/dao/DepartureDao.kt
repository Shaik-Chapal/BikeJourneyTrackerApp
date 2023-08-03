package xyz.summer.bikejourneytracker.data.local.journey.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Upsert
import xyz.summer.bikejourneytracker.data.local.journey.constant.JourneyDatabaseConst
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.DepartureEntity


@Dao
interface DepartureDao {
    @Transaction
    suspend fun insertStations(beers: List<DepartureEntity>, clearCache: Boolean) {
        if (clearCache) deleteAllStation()
        upsertStations(beers)
    }

    ///////////////////////////////////////////////////////////////////////////
    // UPSERT
    ///////////////////////////////////////////////////////////////////////////

    @Upsert
    suspend fun upsertStations(beers: List<DepartureEntity>)

    ///////////////////////////////////////////////////////////////////////////
    // DELETE
    ///////////////////////////////////////////////////////////////////////////

    @Query("DELETE FROM ${JourneyDatabaseConst.TABLE_D}")
    suspend fun deleteAllStation()

    ///////////////////////////////////////////////////////////////////////////
    // GET
    ///////////////////////////////////////////////////////////////////////////

    @Query("SELECT * FROM ${JourneyDatabaseConst.TABLE_D}")
    fun getStation(): PagingSource<Int, DepartureEntity>
}