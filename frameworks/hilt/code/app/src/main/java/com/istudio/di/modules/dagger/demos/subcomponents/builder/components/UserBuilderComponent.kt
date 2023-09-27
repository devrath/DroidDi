package com.istudio.di.modules.dagger.demos.subcomponents.builder.components

import com.istudio.di.modules.dagger.demos.subcomponents.builder.modules.UserModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UserModule::class])
interface UserBuilderComponent {
    fun getPhoneComponentBuilder() : PhoneComponent.Builder
}