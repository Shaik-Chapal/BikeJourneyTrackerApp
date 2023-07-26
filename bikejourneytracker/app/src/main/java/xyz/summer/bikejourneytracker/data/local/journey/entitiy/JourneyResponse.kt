package xyz.summer.bikejourneytracker.data.local.journey.entitiy

import xyz.summer.bikejourneytracker.data.remote.journey.dto.Journey

data class ApiResponse(
    val totalItems: Long,
    val totalPages: Long,
    val pageNumber: Long,
    val pageSize: Long,
    val journeys: List<Journey>
)
