package com.istudio.di.modules.dagger.demos.scopes.introdemo.modules

import com.istudio.di.modules.dagger.demos.scopes.introdemo.implementations.connection.Connection
import com.istudio.di.modules.dagger.demos.scopes.introdemo.implementations.connection.HttpConnection
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck


@Module
@DisableInstallInCheck
class HttpConnectionModule {

    @Provides
    fun provideHttpConnection() : Connection {
        return HttpConnection()
    }

}