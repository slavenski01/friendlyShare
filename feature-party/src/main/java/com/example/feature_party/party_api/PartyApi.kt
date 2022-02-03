package com.example.feature_party.party_api

import com.example.module_injector.BaseAPI

interface PartyApi : BaseAPI {
    fun partyStarter(): PartyStarter
}