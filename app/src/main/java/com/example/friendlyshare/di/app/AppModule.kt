package com.example.friendlyshare.di.app

import android.content.Context
import com.example.feature_party.party_api.PartyFeatureApi
import com.example.feature_party.party_impl.di.PartyFeatureComponentHolder
import com.example.feature_party.party_impl.di.PartyFeatureDependencies
import com.example.friendlyshare.PartyDaggerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideContext(): Context {
        return PartyDaggerApplication.appContext
    }

    @Singleton
    @Provides
    fun providePartyFeatureDependencies(featureParty: PartyFeatureApi): PartyFeatureDependencies {
        return object : PartyFeatureDependencies {}
    }

    @Singleton
    @Provides
    fun provideFeatureParty(dependencies: PartyFeatureDependencies): PartyFeatureApi {
        PartyFeatureComponentHolder.init(dependencies = dependencies)
        return PartyFeatureComponentHolder.get()
    }
}