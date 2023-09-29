package com.istudio.di.modules.hilt.demos.scoping_demo.modules

import com.istudio.di.modules.hilt.demos.scoping_demo.implementations.HiltNetworkService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object HiltScopingModuleSingleton {

    @Provides
    fun getNetworkService() : HiltNetworkService {
        return HiltNetworkService()
    }

}