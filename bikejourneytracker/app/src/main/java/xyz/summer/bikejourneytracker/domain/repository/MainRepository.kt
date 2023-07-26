package xyz.summer.bikejourneytracker.domain.repository

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import xyz.summer.bikejourneytracker.domain.model.JourneyModel

interface MainRepository {

    ///////////////////////////////////////////////////////////////////////////
    // GET
    ///////////////////////////////////////////////////////////////////////////

    fun getBeers(): Flow<PagingData<JourneyModel>>
}