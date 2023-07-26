package xyz.summer.bikejourneytracker.data.remote.journey.constant

object JourneyApiConst {
//http://www.api.skygreenblue.xyz/api/Journey?pageSize=10&pageNumber=1
    const val BASE_URL = "http://www.api.skygreenblue.xyz/api/"

    object GetJourneys {
        const val ENDPOINT = "Journey"
        const val LIMIT = 10
        const val ENABLE_PLACEHOLDERS = false

        object Query {
            const val PAGE = "pageNumber"
            const val PER_PAGE = "pageSize"
        }
    }
}