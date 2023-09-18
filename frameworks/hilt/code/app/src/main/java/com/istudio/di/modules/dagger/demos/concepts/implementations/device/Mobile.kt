package com.istudio.di.modules.dagger.demos.concepts.implementations.device

import com.istudio.di.utils.PrintUtils
import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject

class Mobile @Inject constructor(
    var battery: Battery,
    var screen: Screen
){

    init {
        printLog("Mobile constructor is invoked !")
    }

    fun runMobile() {
        printLog("Mobile is running !")
    }


}