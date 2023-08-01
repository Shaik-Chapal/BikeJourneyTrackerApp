package xyz.summer.bikejourneytracker.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import xyz.summer.bikejourneytracker.domain.model.StationModel
import xyz.summer.bikejourneytracker.domain.usecase.GetStations
import javax.inject.Inject

@HiltViewModel
class StationListViewModel @Inject constructor(
    getJourneys: GetStations,
) : ViewModel() {

    val beers: Flow<PagingData<StationModel>> = getJourneys().cachedIn(viewModelScope)
}