package com.istudio.di.modules.hilt.demos.scoping_demo.implementations

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class DownloaderService @Inject constructor(){

    init {
        PrintUtils.printLog("DownloaderService class is built")
    }

    fun downloadData(data : String) {
        PrintUtils.printLog("Reference address:-> $data")
    }

}