package xyz.summer.bikejourneytracker.data.mapper

import xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity
import xyz.summer.bikejourneytracker.data.remote.journey.dto.Journey
import xyz.summer.bikejourneytracker.data.station.Station
import xyz.summer.bikejourneytracker.domain.model.JourneyModel
import xyz.summer.bikejourneytracker.domain.model.StationModel

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

fun StationEntity.toModel(): StationModel {
    return StationModel(

        fid = fid,
        id = id,
        kapasiteet = kapasiteet,
        kaupunki = kaupunki,
        name = name,
        namn = namn,
        nimi = nimi,
        operaattor = operaattor,
        osoite = osoite,
        stad = stad,
        x = x,
        y=y,
        adress = adress

    )
}

fun Station.toEntity(): StationEntity {
    return StationEntity(

        fid = this.fid,
        id = this.id,
        kapasiteet = this.kapasiteet,
        kaupunki = this.kaupunki,
        name = this.name,
        namn = this.namn,
        nimi = this.nimi,
        operaattor = this.operaattor,
        osoite = this.osoite,
        stad = this.stad,
        x = this.x,
        y=this.y,
        adress = this.address
    )
}
