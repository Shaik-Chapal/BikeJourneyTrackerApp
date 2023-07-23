package com.project.bikejourneytrackerapp.viewmodel

import java.io.Serializable

sealed class ViewModelState : Serializable {
    object Loading : ViewModelState()
    data class Success(val data: List<Post>) : ViewModelState()
    data class Offline(val data: List<Post>) : ViewModelState()
    data class Error(val message: String) : ViewModelState()
}