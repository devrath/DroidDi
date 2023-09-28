package com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.components

import com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.DaggerMultiBindingElementsIntoSetActivity
import com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.implementation.Car
import com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.modules.CarModule
import dagger.Component


@Component(modules = [CarModule::class])
interface CarComponent {

    fun inject(activity: DaggerMultiBindingElementsIntoSetActivity)
    fun provideCars(): Set<@JvmSuppressWildcards Car>

}
