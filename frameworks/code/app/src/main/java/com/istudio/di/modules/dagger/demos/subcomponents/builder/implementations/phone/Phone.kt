package com.istudio.di.modules.dagger.demos.subcomponents.builder.implementations.phone

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class Phone @Inject constructor(
    val battery: Battery, val screen: Screen
) {

    fun startPhone(){
        PrintUtils.printLog("Phone is started !")
    }

}