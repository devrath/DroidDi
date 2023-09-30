package com.istudio.di.modules.hilt.demos.multimodule_demo.entrypoints

import com.istudio.di.modules.hilt.demos.multimodule_demo.implementations.Phone
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface PhoneModuleEntrypoint {
    fun phoneEntrypoint(): Phone
}