package com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingmodule

import com.istudio.di.utils.PrintUtils

class AnalyticsService {


    fun trackEvent(action:String){
        PrintUtils.printLog("Analytics service has tracked your action:-> $action")
    }

}