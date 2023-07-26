package xyz.summer.bikejourneytracker.data.repository

import androidx.paging.Pager
import androidx.paging.PagingData
import androidx.paging.map
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import xyz.summer.bikejourneytracker.data.local.journey.entitiy.JourneyEntity
import xyz.summer.bikejourneytracker.data.mapper.toModel
import xyz.summer.bikejourneytracker.domain.model.JourneyModel
import xyz.summer.bikejourneytracker.domain.repository.MainRepository

class MainRepositoryImp(
    private val getBeersPager: Pager<Int, JourneyEntity>,
) : MainRepository {

    ///////////////////////////////////////////////////////////////////////////
    // GET
    ///////////////////////////////////////////////////////////////////////////

    override fun getBeers(): Flow<PagingData<JourneyModel>> {
        return getBeersPager.flow.map { entities -> entities.map { entity -> entity.toModel() } }
    }
}