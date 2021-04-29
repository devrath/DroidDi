package com.demo.code.typesofdi.hilt.sampleone.concepts.contextUseDemo.di

import com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.qualifiers.DieselEngineQualifier
import com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.qualifiers.PetrolEngineQualifier
import com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.vehicleParts.MarutiEngine
import com.demo.code.typesofdi.hilt.sampleone.concepts.contextUseDemo.vehicleParts.SwiftDieselEngine
import com.demo.code.typesofdi.hilt.sampleone.concepts.contextUseDemo.vehicleParts.SwiftPetrolEngine
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
class EngineModule {

    @PetrolEngineQualifier
    @Provides
    fun providesPetrolSwiftEngine() : SwiftPetrolEngine {
        return SwiftPetrolEngine()
    }

    @DieselEngineQualifier
    @Provides
    fun providesDieselSwiftEngine() : SwiftDieselEngine {
        return SwiftDieselEngine()
    }

}