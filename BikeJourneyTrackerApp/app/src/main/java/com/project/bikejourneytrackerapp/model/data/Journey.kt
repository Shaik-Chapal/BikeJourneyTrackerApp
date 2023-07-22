package com.project.bikejourneytrackerapp.model.data

data class Journey(
    val coveredDistance: Int,
    val departure: String,
    val departureStationId: Int,
    val departureStationName: String,
    val durationSec: Int,
    val `return`: String,
    val returnStationId: Int,
    val returnStationName: String
)