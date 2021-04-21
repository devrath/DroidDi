package com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.di.modules

import com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Battery
import com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Mobile
import com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts.Screen
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MobileModule {

    @Singleton
    @Provides
    fun provideMobile(battery: Battery,screen: Screen) : Mobile {
        return Mobile(battery,screen)
    }

}