package com.istudio.di.modules.hilt.demos.multibinding_demo.into_set_demo.modules

import com.istudio.di.modules.hilt.demos.multibinding_demo.into_set_demo.implementations.America
import com.istudio.di.modules.hilt.demos.multibinding_demo.into_set_demo.implementations.Country
import com.istudio.di.modules.hilt.demos.multibinding_demo.into_set_demo.implementations.Russia
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@InstallIn(SingletonComponent::class)
@Module
interface HiltCountryModule {

    @Binds
    @IntoSet
    fun bindAmerica(country : America) : Country

    @Binds
    @IntoSet
    fun bindRussia(country : Russia) : Country

}