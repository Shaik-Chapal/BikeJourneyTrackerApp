package xyz.summer.bikejourneytracker.data.source

import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import retrofit2.HttpException
import xyz.summer.bikejourneytracker.data.local.journey.dao.StationDao
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.StationEntity
import xyz.summer.bikejourneytracker.data.mapper.toEntity
import xyz.summer.bikejourneytracker.data.remote.journey.api.JourneyApi
import java.io.IOException

class GetStationSource(
    private val api: JourneyApi,
    private val dao: StationDao,
) : RemoteMediator<Int, StationEntity>() {



    override suspend fun load(loadType: LoadType, state: PagingState<Int, StationEntity>): RemoteMediator.MediatorResult {
        return try {
            val page = when (loadType) {
                LoadType.REFRESH -> 1
                LoadType.PREPEND -> return RemoteMediator.MediatorResult.Success(true)
                LoadType.APPEND -> {
                    val last = state.lastItemOrNull()
                    if (last == null) 1 else (last.fid / state.config.pageSize) + 1
                }
            }

            val dtos = api.getStations(
                page = page,
                perPage = state.config.pageSize
            )

            if (dtos.stations.isNotEmpty()) {
                val entities = dtos.stations.map { it.toEntity() }
                dao.insertStations(
                    beers = entities,
                    clearCache = loadType == LoadType.REFRESH
                )
            }

            RemoteMediator.MediatorResult.Success(dtos.stations.isEmpty())
        } catch (e: IOException) {
            RemoteMediator.MediatorResult.Error(e)
        } catch (e: HttpException) {
            RemoteMediator.MediatorResult.Error(e)
        }
    }
}