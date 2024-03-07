package com.istudio.di.modules.hilt.demos.clientserver_demo.di

import com.istudio.di.modules.hilt.demos.clientserver_demo.data.api.ApiService
import com.istudio.di.modules.hilt.demos.clientserver_demo.data.repository.MainRepositoryImpl
import com.istudio.di.modules.hilt.demos.clientserver_demo.domain.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideNoteRepository(db: ApiService): MainRepository {
        return MainRepositoryImpl(db)
    }


}