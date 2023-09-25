package com.istudio.di.modules.dagger.demos.scopes.introdemo.components

import com.istudio.di.modules.dagger.demos.scopes.introdemo.IntroScopeDemoActivity
import com.istudio.di.modules.dagger.demos.scopes.introdemo.implementations.connection.HttpsConnection
import com.istudio.di.modules.dagger.demos.scopes.introdemo.modules.HttpsConnectionModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [HttpsConnectionModule::class])
interface ConnectionComponent {
    fun inject(activity: IntroScopeDemoActivity)

    fun provideHttpsConnection() : HttpsConnection
}