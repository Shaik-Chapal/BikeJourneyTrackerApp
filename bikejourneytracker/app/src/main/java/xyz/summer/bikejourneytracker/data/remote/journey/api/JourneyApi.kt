package xyz.summer.bikejourneytracker.data.remote.journey.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.ApiResponse
import xyz.summer.bikejourneytracker.data.remote.journey.Return.ReturnResponseItem
import xyz.summer.bikejourneytracker.data.remote.journey.constant.JourneyApiConst.GetJourneys
import xyz.summer.bikejourneytracker.data.station.StationResponse
import xyz.summer.bikejourneytracker.data.top_departure.DepartureResponse
import xyz.summer.bikejourneytracker.data.top_departure.DepartureResponseItem
import java.util.concurrent.Flow

interface JourneyApi {

    @GET(GetJourneys.ENDPOINTDeparture)
    suspend fun getDeparture(): List<DepartureResponseItem>

    @GET(GetJourneys.ENDPOINTReturn)
    suspend fun getReturn(): List<ReturnResponseItem>


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