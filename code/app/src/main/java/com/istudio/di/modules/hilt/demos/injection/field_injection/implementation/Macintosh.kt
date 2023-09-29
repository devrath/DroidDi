package com.istudio.di.modules.hilt.demos.injection.field_injection.implementation

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class Macintosh @Inject constructor() {

    init {
        PrintUtils.printLog("Macintosh constructor is invoked !")
    }

}