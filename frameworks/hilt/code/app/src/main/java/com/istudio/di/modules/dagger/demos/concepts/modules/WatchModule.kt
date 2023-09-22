package com.istudio.di.modules.dagger.demos.concepts.modules

import com.istudio.di.modules.dagger.demos.concepts.implementations.watch.Watch
import com.istudio.di.modules.dagger.demos.concepts.implementations.watch.WatchBattery
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class WatchModule(private var batteryCapacity: Int) {

    @Provides
    fun provideBattery() : WatchBattery {
        return WatchBattery(batteryCapacity)
    }

    @Provides
    fun provideWatch(watchBattery: WatchBattery) : Watch {
        return Watch(watchBattery)
    }

}