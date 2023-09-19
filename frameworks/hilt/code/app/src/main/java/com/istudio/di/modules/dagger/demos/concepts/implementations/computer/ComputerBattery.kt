package com.istudio.di.modules.dagger.demos.concepts.implementations.computer

import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject

class ComputerBattery @Inject constructor() {

    init {
        printLog("ComputerBattery constructor is invoked !")
    }

}