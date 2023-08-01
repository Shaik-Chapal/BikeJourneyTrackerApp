package xyz.summer.bikejourneytracker.data.source

import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import okio.IOException
import retrofit2.HttpException
import xyz.summer.bikejourneytracker.data.local.journey.dao.JourneyDao
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity
import xyz.summer.bikejourneytracker.data.mapper.toEntity
import xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi

class GetJourneySource(
    private val api: JourneyApi,
    private val dao: JourneyDao,
) : RemoteMediator<Int, JourneyEntity>() {



    override suspend fun load(loadType: LoadType, state: PagingState<Int, JourneyEntity>): MediatorResult {
        return try {
            val page = when (loadType) {
                LoadType.REFRESH -> 1
                LoadType.PREPEND -> return MediatorResult.Success(true)
                LoadType.APPEND -> {
                    val last = state.lastItemOrNull()
                    if (last == null) 1 else (last.departureStationId / state.config.pageSize) + 1
                }
            }

            val dtos = api.getBeers(
                page = page,
                perPage = state.config.pageSize
            )

            if (dtos.journeys.isNotEmpty()) {
                val entities = dtos.journeys.map { it.toEntity() }
                dao.insertBeers(
                    beers = entities,
                    clearCache = loadType == LoadType.REFRESH
                )
            }

            MediatorResult.Success(dtos.journeys.isEmpty())
        } catch (e: IOException) {
            MediatorResult.Error(e)
        } catch (e: HttpException) {
            MediatorResult.Error(e)
        }
    }
}