package com.istudio.di.modules.hilt.demos.multimodule_demo.modules

import com.istudio.di.modules.hilt.demos.multimodule_demo.implementations.Phone
import com.istudio.di.modules.hilt.demos.multimodule_demo.implementations.Xiaomi
import dagger.Binds
import dagger.Module
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface PhoneModule {
    @Binds
    fun providePhone(phone: Xiaomi) : Phone
}