package com.istudio.di.modules.dagger.demos.concepts.components.watch

import com.istudio.di.modules.dagger.demos.concepts.implementations.watch.Watch
import com.istudio.di.modules.dagger.demos.concepts.modules.watch.WatchModule
import dagger.Component


@Component(modules = [WatchModule::class])
interface WatchComponent {

    fun getWatch(): Watch

}