package xyz.summer.bikejourneytracker.domain.repository

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import xyz.summer.bikejourneytracker.domain.model.JourneyModel
import xyz.summer.bikejourneytracker.domain.model.StationModel

interface MainRepository {



    fun getBeers(): Flow<PagingData<JourneyModel>>
    fun getStations(): Flow<PagingData<StationModel>>
}