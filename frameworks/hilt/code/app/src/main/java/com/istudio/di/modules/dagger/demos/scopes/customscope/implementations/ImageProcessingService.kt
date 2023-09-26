package com.istudio.di.modules.dagger.demos.scopes.customscope.implementations

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class ImageProcessingService {

    fun initiateImageProcessing(){
        PrintUtils.printLog("Image processing is initiated")
    }

}