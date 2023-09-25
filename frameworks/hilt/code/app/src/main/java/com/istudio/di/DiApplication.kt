package com.istudio.di

import android.app.Application
import com.istudio.di.modules.dagger.demos.scopes.introdemo.components.ConnectionComponent
import com.istudio.di.modules.dagger.demos.scopes.introdemo.components.DaggerConnectionComponent
import com.istudio.di.modules.dagger.demos.scopes.introdemo.implementations.connection.HttpsConnection
import com.istudio.di.modules.dagger.demos.scopes.introdemo.modules.HttpsConnectionModule
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DiApplication : Application() {

    private lateinit var connComp : ConnectionComponent
    override fun onCreate() {
        super.onCreate()
        connComp = DaggerConnectionComponent.create()
    }

    fun provideHttpConnection(): ConnectionComponent {
        return connComp;
    }
}