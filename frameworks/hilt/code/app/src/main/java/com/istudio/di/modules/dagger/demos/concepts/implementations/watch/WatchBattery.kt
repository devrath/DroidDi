package com.istudio.di.modules.dagger.demos.concepts.implementations.watch

import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject

class WatchBattery @Inject constructor(
    private var batteryCapacity: Int
){

    init {
        printLog("WatchBattery constructor is invoked !")
    }

    fun startBatteryConfig(){
        printLog("WatchBattery started with configuration -> $batteryCapacity")
    }

    fun getCapacity(): Int {
        return batteryCapacity
    }

}