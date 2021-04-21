package com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.di.modules

import com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Battery
import com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Screen
import dagger.Module
import dagger.Provides

@Module
class ScreenModule {

    @Provides
    fun provideBattery() : Screen {
        return Screen()
    }

}