package com.istudio.di.modules.dagger.demos.subcomponents.factory.implementations.phone

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class Screen @Inject constructor() {

    fun displayInformation(){
        PrintUtils.printLog("Screen is displayed !")
    }

}