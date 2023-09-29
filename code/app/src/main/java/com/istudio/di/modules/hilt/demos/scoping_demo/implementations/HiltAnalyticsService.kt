package com.istudio.di.modules.hilt.demos.scoping_demo.implementations

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HiltAnalyticsService @Inject constructor() {

    fun logAnalytics(data : String) {
        PrintUtils.printLog(data)
    }

}