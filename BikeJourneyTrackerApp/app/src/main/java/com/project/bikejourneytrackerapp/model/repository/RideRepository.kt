package com.project.bikejourneytrackerapp.model.repository

interface RideRepository {
    suspend fun getPosts(after: String? = null): RepositoryResult

    sealed class RepositoryResult {
        data class Success(val posts: List<Post>, val after: String) : RepositoryResult()
        data class Error(val exception: String) : RepositoryResult()

    }
}