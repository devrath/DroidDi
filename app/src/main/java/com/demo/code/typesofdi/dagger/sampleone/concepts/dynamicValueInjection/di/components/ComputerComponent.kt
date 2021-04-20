package com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.di.components

import com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.di.modules.ComputerModule
import com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.view.DynamicValueInjectionFragment
import dagger.Component

@Component(modules = [ComputerModule::class])
interface ComputerComponent {
    fun inject(dynamicValueInjectionFragment: DynamicValueInjectionFragment)
}