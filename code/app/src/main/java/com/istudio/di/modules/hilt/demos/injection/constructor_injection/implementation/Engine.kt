package com.istudio.di.modules.hilt.demos.injection.constructor_injection.implementation

import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject


class Engine @Inject constructor() {

    init {
        printLog("Engine constructor is invoked !")
    }

}