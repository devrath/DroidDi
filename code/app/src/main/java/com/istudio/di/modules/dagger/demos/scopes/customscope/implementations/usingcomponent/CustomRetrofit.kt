package com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent

import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingmodule.AnalyticsService
import com.istudio.di.modules.dagger.demos.scopes.customscope.scopes.ActivityScope
import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

@ActivityScope
class CustomRetrofit @Inject constructor(
    private val serializer : CustomGson,
    private val networkCore : CustomOkHttp,
    private val analyticsService: AnalyticsService
){

    fun initiateRetrofit() {
        PrintUtils.printLog("Custom retrofit initiate method is invoked!")
        PrintUtils.printLog("serializer INSTANCE+${serializer.hashCode()}")
        PrintUtils.printLog("networkCore INSTANCE+${networkCore.hashCode()}")
        PrintUtils.printLog("analyticsService INSTANCE+${analyticsService.hashCode()}")
        analyticsService.trackEvent("RETROFIT")
    }


}