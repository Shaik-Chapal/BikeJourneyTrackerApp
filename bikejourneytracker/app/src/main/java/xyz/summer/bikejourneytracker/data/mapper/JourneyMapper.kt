package xyz.summer.bikejourneytracker.data.mapper

import xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity
import xyz.summer.bikejourneytracker.data.remote.journey.dto.Journey
import xyz.summer.bikejourneytracker.domain.model.JourneyModel

fun Journey.toEntity(): JourneyEntity {
    return JourneyEntity(
        departure = departure,
        returnTime = returnTime,
        departureStationId = departureStationId,
        returnStationName = returnStationName,
        departureStationName = departureStationName,
        coveredDistance = coveredDistance,
        returnStationId = returnStationId,
        durationSec = durationSec
    )
}

fun JourneyEntity.toModel(): JourneyModel {
    return JourneyModel(
        departure = departure,
        returnTime = returnTime,
        departureStationId = departureStationId,
        returnStationName = returnStationName,
        departureStationName = departureStationName,
        coveredDistance = coveredDistance,
        returnStationId = returnStationId,
        durationSec = durationSec
    )
}