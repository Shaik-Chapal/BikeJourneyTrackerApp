package xyz.summer.bikejourneytracker.data.remote.journey.constant

object JourneyApiConst {

    const val BASE_URL = "http://www.api.skygreenblue.xyz/api/"
///Journey/popular-return-stations?topN=5
    object GetJourneys {
        const val ENDPOINTDeparture = "Journey/popular-departure-stations?topN=5"
        const val ENDPOINTReturn = "Journey/popular-return-stations?topN=5"
        const val ENDPOINT = "Journey"
        const val ENDPOINTSTATION = "Journey/stations"
        const val LIMIT = 10
        const val ENABLE_PLACEHOLDERS = false

        object Query {
            const val PAGE = "pageNumber"
            const val PER_PAGE = "pageSize"
        }
    }
}