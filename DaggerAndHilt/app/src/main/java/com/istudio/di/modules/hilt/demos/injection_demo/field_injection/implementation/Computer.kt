package com.istudio.di.modules.hilt.demos.injection_demo.field_injection.implementation

import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject

class Computer @Inject constructor(
    var mac: Macintosh,
    var windows: Microsoft
) {

    init {
        printLog("Computer constructor is invoked !")
    }

    fun start() {
        printLog("Computer has started")
    }

}