package xyz.summer.bikejourneytracker.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import xyz.summer.bikejourneytracker.data.remote.journey.Return.ReturnResponseItem
import xyz.summer.bikejourneytracker.data.repository.DepartureRepository
import xyz.summer.bikejourneytracker.data.top_departure.DepartureResponse
import xyz.summer.bikejourneytracker.data.top_departure.DepartureResponseItem
import xyz.summer.bikejourneytracker.domain.model.StationModel
import javax.inject.Inject


@HiltViewModel
class DepartureViewModel @Inject constructor(private val repository: DepartureRepository) : ViewModel() {

    val departureData: Flow<List<DepartureResponseItem>> = flow {
        val departures = repository.getDeparture()
        emit(departures)
    }.flowOn(Dispatchers.IO)

}


@HiltViewModel
class ReturnViewModel @Inject constructor(private val repository: DepartureRepository) : ViewModel() {

    val departureData: Flow<List<ReturnResponseItem>> = flow {
        val departures = repository.getReturn()
        emit(departures)
    }.flowOn(Dispatchers.IO)

}