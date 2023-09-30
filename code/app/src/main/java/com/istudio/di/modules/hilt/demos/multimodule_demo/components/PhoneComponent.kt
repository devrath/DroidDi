package com.istudio.di.modules.hilt.demos.multimodule_demo.components

import android.content.Context
import com.istudio.di.modules.hilt.demos.multimodule_demo.entrypoints.PhoneModuleEntrypoint
import com.istudio.di.modules.hilt.demos.multimodule_demo.modules.PhoneModule
import com.istudio.hilt_demo_module.HiltMultiModuleScenarioActivity
import dagger.BindsInstance
import dagger.Component


@Component(dependencies = [PhoneModuleEntrypoint::class])
interface PhoneComponent {

    fun inject(activity: HiltMultiModuleScenarioActivity)

    @Component.Builder
    interface Builder {
        fun context(@BindsInstance context: Context): Builder
        fun appDependencies(phoneDependencies: PhoneModuleEntrypoint): Builder
        fun build(): PhoneComponent
    }

}