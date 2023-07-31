package xyz.summer.bikejourneytracker.data.remote.journey.constant

object JourneyApiConst {

    const val BASE_URL = "http://www.api.skygreenblue.xyz/api/"
//https://localhost:7182/api/Journey/stations?pageSize=10&pageNumber=1
    object GetJourneys {
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