package com.istudio.di.modules.hilt.demos.scoping_demo.modules

import com.istudio.di.modules.hilt.demos.scoping_demo.implementations.HiltNetworkService
import com.istudio.di.modules.hilt.demos.scoping_demo.implementations.SerializationService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object HiltScopingApplicationModule {

    @Provides
    fun getNetworkService() : HiltNetworkService {
        return HiltNetworkService()
    }

    @Singleton
    @Provides
    fun getSerializationService() : SerializationService {
        return SerializationService()
    }

}