package com.istudio.di.modules.dagger.demos.subcomponents.factory.components

import com.istudio.di.modules.dagger.demos.subcomponents.factory.modules.UserModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UserModule::class])
interface UserComponent {
    fun getPhoneComponentFactory() : PhoneComponent.Factory
}