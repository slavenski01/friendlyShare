package com.example.feature_party.party_impl.start

import android.content.Context
import android.util.Log
import com.example.feature_party.party_api.PartyStarter
import javax.inject.Inject

class PartyStarterImpl @Inject constructor(): PartyStarter {
    override fun start(context: Context) {
        Log.e("PS", "isStart")
    }
}