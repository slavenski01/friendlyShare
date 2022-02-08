package com.example.friendlyshare.presentation.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.example.core_utils.presentation.viewmodel.BaseViewModel


class MainViewModel : BaseViewModel() {
    private val _uiState = mutableStateOf<MainStates>(MainStates.LOADING)
    val uiState: State<MainStates>
        get() = _uiState
}