package com.project.bikejourneytrackerapp.model.repository

import com.project.bikejourneytrackerapp.model.service.RideService
import com.project.bikejourneytrackerapp.util.PostMapper
import javax.inject.Inject

class RideRepositoryImpl @Inject constructor(
    private val rideService: RideService,
    private val postMapper: PostMapper
): RideRepository {
    override suspend fun getPosts(after: String?): RideRepository.RepositoryResult {
        return try {
            val response  = rideService.getPosts(after)
            response.toResult(postMapper)
        }catch (e: Exception) {
            RideRepository.RepositoryResult.Error(e.localizedMessage ?: "Unknown error")
        }
    }
}

private fun RedditResponse.toResult(postMapper: PostMapper): RideRepository.RepositoryResult {
    return RideRepository.RepositoryResult.Success(postMapper.map(this), this.data.after)
}
