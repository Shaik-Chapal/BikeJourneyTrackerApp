package xyz.summer.bikejourneytracker.data.repository

import xyz.summer.bikejourneytracker.data.remote.journey.Return.ReturnResponseItem
import xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi
import xyz.summer.bikejourneytracker.data.top_departure.DepartureResponseItem
import javax.inject.Inject

class DepartureRepository @Inject constructor(private val apiService: JourneyApi) {
    suspend fun getDeparture(): List<DepartureResponseItem> = apiService.getDeparture()
    suspend fun getReturn(): List<ReturnResponseItem> = apiService.getReturn()
}
