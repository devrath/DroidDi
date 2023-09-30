package com.istudio.di.modules.hilt.demos.multibinding_demo.into_map_demo.modules

import com.istudio.di.modules.hilt.demos.multibinding_demo.into_map_demo.implementations.BangaloreCity
import com.istudio.di.modules.hilt.demos.multibinding_demo.into_map_demo.implementations.City
import com.istudio.di.modules.hilt.demos.multibinding_demo.into_map_demo.implementations.HassanCity
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.Multibinds

@InstallIn(SingletonComponent::class)
@Module
abstract class HiltCityModule {

    @Multibinds
    abstract fun multiBindsCityProviders(): Map<Class<*>, City>

    @Binds
    @IntoMap
    @ClassKey(HassanCity::class)
    abstract fun provideHassanCity(impl: HassanCity) : City

    @Binds
    @IntoMap
    @ClassKey(BangaloreCity::class)
    abstract fun provideBangaloreCity(impl: BangaloreCity) : City

}