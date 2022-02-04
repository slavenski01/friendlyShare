package com.example.feature_party.party_impl.di

import com.example.core_utils.di.general.PerFeature
import com.example.feature_party.party_api.PartyFeatureApi
import dagger.Component

@Component(dependencies = [PartyFeatureDependencies::class], modules = [PartyModule::class])
@PerFeature
internal abstract class PartyFeatureFeatureComponent : PartyFeatureApi {
    companion object {
        fun initAndGet(partyFeatureDependencies: PartyFeatureDependencies): PartyFeatureFeatureComponent {
            return DaggerPartyFeatureFeatureComponent.builder()
                .partyFeatureDependencies(partyFeatureDependencies)
                .build()
        }
    }
}