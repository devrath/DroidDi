package com.istudio.di.modules.dagger.demos.concepts.implementations.device

import com.istudio.di.utils.PrintUtils
import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject

class Screen @Inject constructor(){

    init {
        printLog("Screen constructor is invoked !")
    }

}