package xyz.summer.bikejourneytracker.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import xyz.summer.bikejourneytracker.domain.model.JourneyModel
import xyz.summer.bikejourneytracker.domain.usecase.GetJourneys
import javax.inject.Inject

@HiltViewModel
class BeerListViewModel @Inject constructor(
    getJourneys: GetJourneys,
) : ViewModel() {

    val beers: Flow<PagingData<JourneyModel>> = getJourneys().cachedIn(viewModelScope)
}