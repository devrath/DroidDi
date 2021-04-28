package com.demo.code.typesofdi.hilt.sampleone.concepts.bindsAnnotation.di

import com.demo.code.typesofdi.hilt.sampleone.concepts.bindsAnnotation.vehicleParts.Car
import com.demo.code.typesofdi.hilt.sampleone.concepts.bindsAnnotation.vehicleParts.Engine
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent


@Module
@InstallIn(FragmentComponent::class)
class CarModule {
    @Provides
    fun provideCar(engine: Engine) : Car = Car(engine)
}