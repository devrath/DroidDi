package com.istudio.di.modules.dagger.demos.multibindings.intomap.components

import com.istudio.di.modules.dagger.demos.multibindings.intomap.DaggerElementsIIntoMapActivity
import com.istudio.di.modules.dagger.demos.multibindings.intomap.implementation.Pen
import com.istudio.di.modules.dagger.demos.multibindings.intomap.modules.PenModule
import dagger.Component


@Component(modules = [PenModule::class])
interface PenComponent {

    fun inject(activity: DaggerElementsIIntoMapActivity)
    fun providePen(): Map<Class<*>, @JvmSuppressWildcards Pen>

}
