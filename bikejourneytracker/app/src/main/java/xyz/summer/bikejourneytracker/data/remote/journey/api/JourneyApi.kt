package xyz.summer.bikejourneytracker.data.remote.journey.api

import retrofit2.http.GET
import retrofit2.http.Query
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.ApiResponse
import xyz.summer.bikejourneytracker.data.remote.journey.constant.JourneyApiConst.GetJourneys
import xyz.summer.bikejourneytracker.data.station.StationResponse

interface JourneyApi {

    @GET(GetJourneys.ENDPOINT)
    suspend fun getBeers(
        @Query(GetJourneys.Query.PAGE) page: Int,
        @Query(GetJourneys.Query.PER_PAGE) perPage: Int,
    ): ApiResponse

    @GET(GetJourneys.ENDPOINTSTATION)
    suspend fun getStations(
        @Query(GetJourneys.Query.PAGE) page: Int,
        @Query(GetJourneys.Query.PER_PAGE) perPage: Int,
    ): StationResponse
}