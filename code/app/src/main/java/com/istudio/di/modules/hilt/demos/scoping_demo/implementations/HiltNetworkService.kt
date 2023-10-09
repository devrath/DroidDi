package com.istudio.di.modules.hilt.demos.scoping_demo.implementations

import com.istudio.di.utils.PrintUtils

class HiltNetworkService {

    init {
        PrintUtils.printLog("HiltNetworkService class is built")
    }


    fun callNetworkEndPoint(data : String) {
        PrintUtils.printLog("Reference address:-> $data")
    }
}