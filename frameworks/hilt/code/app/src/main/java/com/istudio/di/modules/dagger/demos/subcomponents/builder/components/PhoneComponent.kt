package com.istudio.di.modules.dagger.demos.subcomponents.builder.components

import com.istudio.di.modules.dagger.demos.scopes.customscope.scopes.ActivityScope
import com.istudio.di.modules.dagger.demos.subcomponents.builder.DaggerSubComponentsBuilderActivity
import com.istudio.di.modules.dagger.demos.subcomponents.builder.modules.PhoneModule
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [PhoneModule::class])
interface PhoneComponent {
    fun inject(activity: DaggerSubComponentsBuilderActivity)


    @Subcomponent.Factory
    interface Builder{
        fun build() : PhoneComponent

    }
}