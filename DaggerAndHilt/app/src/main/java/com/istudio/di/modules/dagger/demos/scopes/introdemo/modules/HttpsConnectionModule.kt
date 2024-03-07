package com.istudio.di.modules.dagger.demos.scopes.introdemo.modules

import com.istudio.di.modules.dagger.demos.scopes.applicationscope.scope.ApplicationScope
import com.istudio.di.modules.dagger.demos.scopes.introdemo.implementations.connection.Connection
import com.istudio.di.modules.dagger.demos.scopes.introdemo.implementations.connection.HttpsConnection
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Singleton

@Module
@DisableInstallInCheck
class HttpsConnectionModule {

    @ApplicationScope
    @Provides
    fun provideHttpsConnection() : Connection {
        return HttpsConnection()
    }

}