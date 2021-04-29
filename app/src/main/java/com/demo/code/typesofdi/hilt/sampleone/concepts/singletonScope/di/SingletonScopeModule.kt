package com.demo.code.typesofdi.hilt.sampleone.concepts.singletonScope.di

import android.content.Context
import com.demo.code.typesofdi.hilt.sampleone.concepts.singletonScope.vehicleParts.SingletonScopeObject
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(FragmentComponent::class)
class SingletonScopeModule {

    @Provides
    fun providesApplicationContext(@ApplicationContext context: Context) : SingletonScopeObject {
        return SingletonScopeObject(context)
    }

}