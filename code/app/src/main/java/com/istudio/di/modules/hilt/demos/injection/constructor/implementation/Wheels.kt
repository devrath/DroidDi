package com.istudio.di.modules.hilt.demos.injection.constructor.implementation

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class Wheels @Inject constructor() {

    init {
        PrintUtils.printLog("Wheels constructor is invoked !")
    }

}