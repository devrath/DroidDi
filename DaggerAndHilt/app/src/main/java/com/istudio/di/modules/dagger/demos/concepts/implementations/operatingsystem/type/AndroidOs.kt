package com.istudio.di.modules.dagger.demos.concepts.implementations.operatingsystem.type

import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject

class AndroidOs @Inject constructor() : OS {

    override fun getOsType() {
        printLog("OS type is Android")
    }

}