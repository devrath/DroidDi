package com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.di.modules

import com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Battery
import dagger.Module
import dagger.Provides

@Module
class BatteryModule {

    @Provides
    fun provideBattery() : Battery{
        return Battery()
    }

}