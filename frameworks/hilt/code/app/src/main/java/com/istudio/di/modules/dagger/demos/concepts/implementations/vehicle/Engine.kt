package com.istudio.di.modules.dagger.demos.concepts.implementations.vehicle

import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject


class Engine @Inject constructor() {

    init {
        printLog("Engine constructor is invoked !")
    }

}