package com.istudio.di

import android.app.Application
import com.istudio.di.modules.dagger.demos.scopes.customscope.components.usingmodule.ApplicationComponent
import com.istudio.di.modules.dagger.demos.scopes.customscope.components.usingmodule.DaggerApplicationComponent
import com.istudio.di.modules.dagger.demos.scopes.introdemo.components.ConnectionComponent
import com.istudio.di.modules.dagger.demos.scopes.introdemo.components.DaggerConnectionComponent
import com.istudio.di.modules.dagger.demos.subcomponents.factory.components.DaggerUserComponent
import com.istudio.di.modules.dagger.demos.subcomponents.factory.components.UserComponent
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DiApplication : Application() {

    private lateinit var connComp : ConnectionComponent
    private lateinit var appComponent : ApplicationComponent
    private lateinit var userComponent : UserComponent

    override fun onCreate() {
        super.onCreate()
        connComp = DaggerConnectionComponent.builder().build()
        appComponent = DaggerApplicationComponent.builder().build()
        userComponent = DaggerUserComponent.builder().build()
    }

    fun provideHttpConnection(): ConnectionComponent { return connComp }
    fun provideApplicationComponent(): ApplicationComponent { return appComponent }
    fun provideDaggerUserComponent(): UserComponent { return userComponent }

}