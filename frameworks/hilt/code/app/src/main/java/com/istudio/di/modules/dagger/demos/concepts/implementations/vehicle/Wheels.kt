package com.istudio.di.modules.dagger.demos.concepts.implementations.vehicle

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class Wheels @Inject constructor() {

    init {
        PrintUtils.printLog("Wheels constructor is invoked !")
    }

}