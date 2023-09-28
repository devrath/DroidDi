package com.istudio.di.modules.dagger.demos.multibindings.intoset.components

import com.istudio.di.modules.dagger.demos.multibindings.intoset.DaggerMultiBindingIntoSetActivity
import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Telivision
import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.TelivisionBox
import com.istudio.di.modules.dagger.demos.multibindings.intoset.modules.TelivisionModule
import dagger.Component


@Component(modules = [TelivisionModule::class])
interface TelivisionComponent {

    fun inject(activity : DaggerMultiBindingIntoSetActivity)
    fun provideTelivision() : Set<@JvmSuppressWildcards Telivision>

}
