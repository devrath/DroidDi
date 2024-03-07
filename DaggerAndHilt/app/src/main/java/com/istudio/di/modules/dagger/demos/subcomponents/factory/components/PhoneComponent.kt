package com.istudio.di.modules.dagger.demos.subcomponents.factory.components

import com.istudio.di.modules.dagger.demos.scopes.customscope.scopes.ActivityScope
import com.istudio.di.modules.dagger.demos.subcomponents.factory.DaggerSubComponentsFactoryActivity
import com.istudio.di.modules.dagger.demos.subcomponents.factory.modules.PhoneModule
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [PhoneModule::class])
interface PhoneComponent {
    fun inject(activity: DaggerSubComponentsFactoryActivity)


    @Subcomponent.Factory
    interface Factory{
        fun create() : PhoneComponent
    }
}