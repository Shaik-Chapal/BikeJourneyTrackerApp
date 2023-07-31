package xyz.summer.bikejourneytracker.data.station

data class StationResponse(
    val pageNumber: Int,
    val pageSize: Int,
    val stations: List<Station>,
    val totalItems: Int,
    val totalPages: Int
)