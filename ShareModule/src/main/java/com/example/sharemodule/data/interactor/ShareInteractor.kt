package com.example.sharemodule.data.interactor

import com.example.sharemodule.data.repository.PartyRepository

class ShareInteractor(private val repository: PartyRepository) {

    suspend fun getProducts() = repository.getProducts()

    suspend fun getPartyMembers() = repository.getPartyMembers()
}