package xyz.summer.bikejourneytracker.domain.usecase

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import xyz.summer.bikejourneytracker.domain.model.JourneyModel
import xyz.summer.bikejourneytracker.domain.model.StationModel
import xyz.summer.bikejourneytracker.domain.repository.MainRepository

class GetJourneys(
    private val repository: MainRepository,
) {

    operator fun invoke(): Flow<PagingData<JourneyModel>> {
        return repository.getBeers()
    }

}
class GetStations(
    private val repository: MainRepository,
) {

    operator fun invoke(): Flow<PagingData<StationModel>> {
        return repository.getStations()
    }

}