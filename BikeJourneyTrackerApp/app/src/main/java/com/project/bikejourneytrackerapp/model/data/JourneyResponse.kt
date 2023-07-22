package com.project.bikejourneytrackerapp.model.data

data class JourneyResponse(
    val journeys: List<Journey>,
    val pageNumber: Int,
    val pageSize: Int,
    val totalItems: Int,
    val totalPages: Int
)