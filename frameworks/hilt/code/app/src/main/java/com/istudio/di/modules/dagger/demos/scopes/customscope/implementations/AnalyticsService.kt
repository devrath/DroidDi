package com.istudio.di.modules.dagger.demos.scopes.customscope.implementations

import com.istudio.di.utils.PrintUtils

class AnalyticsService {


    fun initiateImageProcessing(){
        PrintUtils.printLog("Analytics service is initiated")
    }

}