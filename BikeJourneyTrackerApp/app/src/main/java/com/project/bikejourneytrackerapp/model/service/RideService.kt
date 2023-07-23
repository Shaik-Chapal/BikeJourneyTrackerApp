package com.project.bikejourneytrackerapp.model.service

import com.project.bikejourneytrackerapp.model.data.JourneyResponse
import com.project.bikejourneytrackerapp.util.Constants.Companion.PATH
import retrofit2.http.GET
import retrofit2.http.Query

interface RideService {
    @GET(PATH)
    suspend fun getPosts(
        @Query("pageSize") pageSize: Int = 10,
        @Query("pageNumber") pageNumber: Int = 1
    ): JourneyResponse
}
