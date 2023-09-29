package com.istudio.di.modules.hilt.demos.scoping_demo.implementations

import com.istudio.di.utils.PrintUtils

class HiltNetworkService {
    fun callNetworkEndPoint(data : String) {
        PrintUtils.printLog(data)
    }
}