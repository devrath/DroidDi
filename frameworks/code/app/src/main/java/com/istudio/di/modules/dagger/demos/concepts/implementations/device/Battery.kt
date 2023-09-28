package com.istudio.di.modules.dagger.demos.concepts.implementations.device

import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject

class Battery @Inject constructor() {

    init {
        printLog("Battery constructor is invoked !")
    }

}