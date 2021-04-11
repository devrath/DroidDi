package com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.di.module

import com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.vehicleParts.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun getWheels() : Wheels {
        return Wheels()
    }

}