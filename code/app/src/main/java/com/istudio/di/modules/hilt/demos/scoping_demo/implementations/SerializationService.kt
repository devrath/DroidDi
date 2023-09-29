package com.istudio.di.modules.hilt.demos.scoping_demo.implementations

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class SerializationService  @Inject constructor() {

    fun serializeData(data : String) {
        PrintUtils.printLog(data)
    }

}