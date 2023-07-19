package com.project.bikejourneytrackerapp.model.service

import com.project.bikejourneytrackerapp.model.data.RedditResponse
import com.project.bikejourneytrackerapp.util.Constants.Companion.AFTER
import com.project.bikejourneytrackerapp.util.Constants.Companion.LIMIT
import com.project.bikejourneytrackerapp.util.Constants.Companion.LIMIT_VALUE
import com.project.bikejourneytrackerapp.util.Constants.Companion.PATH
import retrofit2.http.GET
import retrofit2.http.Query

interface RideService {
    @GET(PATH)
    suspend fun getPosts(@Query(AFTER) after : String? = null, @Query(LIMIT) limit : String = LIMIT_VALUE): RedditResponse
}