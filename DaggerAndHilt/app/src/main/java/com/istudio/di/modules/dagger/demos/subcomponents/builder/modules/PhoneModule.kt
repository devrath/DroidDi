package com.istudio.di.modules.dagger.demos.subcomponents.builder.modules

import com.istudio.di.modules.dagger.demos.scopes.customscope.scopes.ActivityScope
import com.istudio.di.modules.dagger.demos.subcomponents.builder.implementations.phone.Battery
import com.istudio.di.modules.dagger.demos.subcomponents.builder.implementations.phone.Phone
import com.istudio.di.modules.dagger.demos.subcomponents.builder.implementations.phone.Screen
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class PhoneModule {

    @ActivityScope
    @Provides
    fun providePhone(battery: Battery, screen: Screen) : Phone {
        return Phone(battery,screen)
    }

}