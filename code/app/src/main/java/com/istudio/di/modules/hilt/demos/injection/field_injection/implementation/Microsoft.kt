package com.istudio.di.modules.hilt.demos.injection.field_injection.implementation

import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject


class Microsoft @Inject constructor() {

    init {
        printLog("Microsoft constructor is invoked !")
    }

}