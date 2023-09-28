package com.istudio.di.modules.dagger.demos.subcomponents.factory.modules

import com.istudio.di.modules.dagger.demos.subcomponents.factory.implementations.User
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Singleton


@Module
@DisableInstallInCheck
class UserModule {

    @Singleton
    @Provides
    fun provideUser() : User {
        return User(name = "Superman")
    }

}