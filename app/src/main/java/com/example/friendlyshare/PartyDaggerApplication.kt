package com.example.friendlyshare

import android.app.Application
import android.content.Context
import com.example.friendlyshare.di.app.AppComponent
import com.example.friendlyshare.di.app.DaggerAppComponent

class PartyDaggerApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        AppComponent.init(
            DaggerAppComponent.builder()
                .build()
        )
        AppComponent.getComponent().inject(this)
    }

    companion object {
        @Volatile
        lateinit var appContext: Context
            private set
    }
}