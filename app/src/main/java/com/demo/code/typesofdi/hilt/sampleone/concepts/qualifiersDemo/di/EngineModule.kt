package com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.di

import com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.qualifiers.DieselEngineQualifier
import com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.qualifiers.PetrolEngineQualifier
import com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.vehicleParts.MarutiEngine
import com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.vehicleParts.SwiftDieselEngine
import com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.vehicleParts.SwiftPetrolEngine
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
class EngineModule {

    @PetrolEngineQualifier
    @Provides
    fun providesPetrolSwiftEngine() : MarutiEngine {
        return SwiftPetrolEngine()
    }

    @DieselEngineQualifier
    @Provides
    fun providesDieselSwiftEngine() : MarutiEngine {
        return SwiftDieselEngine()
    }

}