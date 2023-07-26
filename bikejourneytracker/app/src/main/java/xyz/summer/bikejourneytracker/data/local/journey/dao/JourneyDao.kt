package xyz.summer.bikejourneytracker.data.local.journey.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Upsert
import xyz.summer.bikejourneytracker.data.local.journey.constant.JourneyDatabaseConst.TABLE_BEER
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity

@Dao
interface JourneyDao {

    ///////////////////////////////////////////////////////////////////////////
    // INSERT
    ///////////////////////////////////////////////////////////////////////////

    @Transaction
    suspend fun insertBeers(beers: List<JourneyEntity>, clearCache: Boolean) {
        if (clearCache) deleteAllBeers()
        upsertBeers(beers)
    }

    ///////////////////////////////////////////////////////////////////////////
    // UPSERT
    ///////////////////////////////////////////////////////////////////////////

    @Upsert
    suspend fun upsertBeers(beers: List<JourneyEntity>)

    ///////////////////////////////////////////////////////////////////////////
    // DELETE
    ///////////////////////////////////////////////////////////////////////////

    @Query("DELETE FROM $TABLE_BEER")
    suspend fun deleteAllBeers()

    ///////////////////////////////////////////////////////////////////////////
    // GET
    ///////////////////////////////////////////////////////////////////////////

    @Query("SELECT * FROM $TABLE_BEER")
    fun getBeers(): PagingSource<Int, JourneyEntity>
}