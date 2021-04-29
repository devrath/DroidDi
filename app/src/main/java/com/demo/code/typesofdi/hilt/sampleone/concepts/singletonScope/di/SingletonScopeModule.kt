package com.demo.code.typesofdi.hilt.sampleone.concepts.singletonScope.di

import com.demo.code.typesofdi.hilt.sampleone.concepts.singletonScope.objects.FragmentScopedObject
import com.demo.code.typesofdi.hilt.sampleone.concepts.singletonScope.objects.SingletonScopeObject
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