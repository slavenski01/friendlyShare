package com.example.feature_party.party_impl.di

import com.example.core_utils.di.general.PerFeature
import com.example.feature_party.party_api.PartyStarter
import com.example.feature_party.party_impl.start.PartyStarterImpl
import dagger.Binds
import dagger.Module

@Module
internal abstract class PartyModule {

    @PerFeature
    @Binds
    abstract fun providePartyStarter(partyStarter: PartyStarterImpl): PartyStarter
}