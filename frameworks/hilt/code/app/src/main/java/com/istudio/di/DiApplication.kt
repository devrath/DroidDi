package com.istudio.di

import android.app.Application
import com.istudio.di.modules.dagger.demos.scopes.customscope.components.ApplicationComponent
import com.istudio.di.modules.dagger.demos.scopes.customscope.components.DaggerApplicationComponent
import com.istudio.di.modules.dagger.demos.scopes.introdemo.components.ConnectionComponent
import com.istudio.di.modules.dagger.demos.scopes.introdemo.components.DaggerConnectionComponent
import com.istudio.di.modules.dagger.demos.scopes.introdemo.implementations.connection.HttpsConnection
import com.istudio.di.modules.dagger.demos.scopes.introdemo.modules.HttpsConnectionModule
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DiApplication : Application() {

    private lateinit var connComp : ConnectionComponent

    private lateinit var appComponent : ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        connComp = DaggerConnectionComponent.builder().build()
        appComponent = DaggerApplicationComponent.builder().build()
    }

    fun provideHttpConnection(): ConnectionComponent { return connComp }
    fun provideApplicationComponent(): ApplicationComponent { return appComponent }

}