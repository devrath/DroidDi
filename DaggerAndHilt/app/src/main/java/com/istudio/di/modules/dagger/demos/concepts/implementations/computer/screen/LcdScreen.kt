package com.istudio.di.modules.dagger.demos.concepts.implementations.computer.screen

import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject

class LcdScreen @Inject constructor() : ComputerScreen {

    init {
        printLog("LcdScreen constructor is invoked !")
    }

    override fun buildScreen() {
        printLog("LcdScreen build screen is invoked !")
    }

}