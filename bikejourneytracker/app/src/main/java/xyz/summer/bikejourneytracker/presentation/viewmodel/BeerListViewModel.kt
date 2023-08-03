package xyz.summer.bikejourneytracker.presentation.viewmodel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
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

class SharedViewModel : ViewModel() {

    private val _res: MutableState<String> = mutableStateOf("")
    val res: State<String> =_res


    fun setData(data:String){
        _res.value = data
    }

}




