package com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.di.modules

import com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Screen
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ScreenModule {

    @Singleton
    @Provides
    fun provideBattery() : Screen {
        return Screen()
    }

}