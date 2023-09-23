package com.istudio.di.modules.dagger.demos.concepts.implementations.operatingsystem

import com.istudio.di.utils.PrintUtils
import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject

class Android @Inject constructor() : OS {

    override fun getOsType() {
        printLog("OS type is Android")
    }

}