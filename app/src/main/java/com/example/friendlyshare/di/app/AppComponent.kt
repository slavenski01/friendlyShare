package com.example.friendlyshare.di.app

import com.example.friendlyshare.PartyDaggerApplication
import dagger.Component
import dagger.internal.Preconditions

@Component(modules = [AppModule::class])
abstract class AppComponent {
    abstract fun inject(partyDaggerApplication: PartyDaggerApplication)

    companion object {
        @Volatile
        private var instance: AppComponent? = null

        fun getComponent(): AppComponent {
            return Preconditions.checkNotNull(
                instance,
                "AppComponent is not initialized yet. Call init first."
            )!!
        }

        fun init(component: AppComponent) {
            require(instance == null) { "AppComponent is already initialized." }
            instance = component
        }
    }
}