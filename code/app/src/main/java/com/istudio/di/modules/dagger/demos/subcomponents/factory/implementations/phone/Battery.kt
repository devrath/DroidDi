package com.istudio.di.modules.dagger.demos.subcomponents.factory.implementations.phone

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class Battery @Inject constructor() {

    fun charging(){
        PrintUtils.printLog("Battery is charging !")
    }

}