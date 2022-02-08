package com.example.friendlyshare.presentation.viewmodels

sealed class MainStates {
    object LOADING : MainStates()
    object LOADED : MainStates()
}