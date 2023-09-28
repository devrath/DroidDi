package com.istudio.di.modules.dagger.demos.concepts.implementations.operatingsystem.type

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class AppleOs @Inject constructor() : OS {

    override fun getOsType() {
        PrintUtils.printLog("OS type is IOS")
    }

}