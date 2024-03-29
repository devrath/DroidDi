package com.istudio.di.modules.dagger.demos.concepts.implementations.vehicle

import com.istudio.di.modules.dagger.demos.concepts.implementations.vehicle.Engine
import com.istudio.di.modules.dagger.demos.concepts.implementations.vehicle.Wheels
import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject

class Car @Inject constructor(
    var wheels: Wheels,
    var engine: Engine
) {

    init {
        printLog("Car constructor is invoked !")
    }

    fun start() {
        printLog("Car is Driving")
    }

}