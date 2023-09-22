package com.istudio.di.modules.dagger.demos.concepts.implementations.watch

import com.istudio.di.utils.PrintUtils
import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject

class Watch @Inject constructor(
    private val watchBattery : WatchBattery
){

    init {
        printLog("Watch class constructor is invoked !")
    }

    fun buildWatch() {
        val capacity = watchBattery.getCapacity()
        printLog(
            "buildWatch method in watch class is invoked " +
            "with capacity $capacity"
        )
    }


}