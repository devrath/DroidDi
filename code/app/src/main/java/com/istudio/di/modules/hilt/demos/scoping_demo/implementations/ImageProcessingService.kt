package com.istudio.di.modules.hilt.demos.scoping_demo.implementations

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class ImageProcessingService @Inject constructor() {

    fun processImage(data : String) {
        PrintUtils.printLog(data)
    }

}