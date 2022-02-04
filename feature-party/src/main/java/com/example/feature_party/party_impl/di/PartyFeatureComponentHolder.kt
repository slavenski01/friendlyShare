package com.example.feature_party.party_impl.di

import android.util.Log
import com.example.feature_party.party_api.PartyFeatureApi
import com.example.module_injector.ComponentHolder

object PartyFeatureComponentHolder : ComponentHolder<PartyFeatureApi, PartyFeatureDependencies> {
    private var partyFeatureComponent: PartyFeatureFeatureComponent? = null

    override fun init(dependencies: PartyFeatureDependencies) {
        Log.i("PartyCH", "init()")
        if (partyFeatureComponent == null) {
            synchronized(PartyFeatureComponentHolder::class.java) {
                if (partyFeatureComponent == null) {
                    Log.i("PartyCH", "initAndGet()")
                    partyFeatureComponent = PartyFeatureFeatureComponent.initAndGet(dependencies)
                }
            }
        }
    }

    override fun get(): PartyFeatureApi = getComponent()

    internal fun getComponent(): PartyFeatureFeatureComponent {
        checkNotNull(partyFeatureComponent) { "PartyFeatureComponent was not initialized!" }
        return partyFeatureComponent!!
    }

    override fun reset() {
        Log.i("PartyCH", "reset()")
        partyFeatureComponent = null
    }
}