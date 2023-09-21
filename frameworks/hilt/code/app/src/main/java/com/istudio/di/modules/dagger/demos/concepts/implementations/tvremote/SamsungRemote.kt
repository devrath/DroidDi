package com.istudio.di.modules.dagger.demos.concepts.implementations.tvremote

import com.istudio.di.utils.PrintUtils.printLog

class SamsungRemote {
    init {
        printLog("Samsung mobile constructor is invoked !")
    }

    fun runMobile() {
        printLog("Running samsung mobile !")
    }

}