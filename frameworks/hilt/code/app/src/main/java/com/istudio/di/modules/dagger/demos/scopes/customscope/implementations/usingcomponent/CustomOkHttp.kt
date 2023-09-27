package com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent

import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.logger.TimberLogger
import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class CustomOkHttp @Inject constructor(){

    init {
        PrintUtils.printLog("CustomOkHttp class invoked")
    }

}