package com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.di.module

import com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.vehicleParts.Engine
import com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.vehicleParts.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun Engine(petrolEngine : PetrolEngine) : Engine

}