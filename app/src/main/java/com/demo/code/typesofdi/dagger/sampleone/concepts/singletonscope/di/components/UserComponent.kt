package com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.di.components

import com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.di.modules.BatteryModule
import com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.di.modules.MobileModule
import com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.di.modules.ScreenModule
import com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.view.SingletonScopeFragment
import dagger.Component

@Component(modules = [BatteryModule::class,
                      MobileModule::class,
                      ScreenModule::class])
interface UserComponent {
    fun inject(singletonScopeFragment : SingletonScopeFragment)
}