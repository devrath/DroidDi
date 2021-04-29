package com.demo.code.typesofdi.hilt.sampleone.concepts.scopeDemo.di

import com.demo.code.typesofdi.hilt.sampleone.concepts.scopeDemo.objects.SingletonScopeObject
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SingletonScopeModule {

    @Singleton
    @Provides
    fun providesSingletonScopeDemo() : SingletonScopeObject {
        return SingletonScopeObject()
    }

}