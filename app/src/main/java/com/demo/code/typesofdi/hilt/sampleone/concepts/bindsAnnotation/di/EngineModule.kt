package com.demo.code.typesofdi.hilt.sampleone.concepts.bindsAnnotation.di

import com.demo.code.typesofdi.hilt.sampleone.concepts.bindsAnnotation.vehicleParts.Engine
import com.demo.code.typesofdi.hilt.sampleone.concepts.bindsAnnotation.vehicleParts.PetrolEngine
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
abstract class EngineModule {

    @Binds
    abstract fun provideEngine(petrolEngine: PetrolEngine) : Engine

}