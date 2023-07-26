package xyz.summer.bikejourneytracker.data.remote.journey.api

import retrofit2.http.GET
import retrofit2.http.Query
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.ApiResponse
import xyz.summer.bikejourneytracker.data.remote.journey.constant.JourneyApiConst.GetJourneys

interface JourneyApi {

    @GET(GetJourneys.ENDPOINT)
    suspend fun getBeers(
        @Query(GetJourneys.Query.PAGE) page: Int,
        @Query(GetJourneys.Query.PER_PAGE) perPage: Int,
    ): ApiResponse
}