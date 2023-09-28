package com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent

import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.logger.CustomLogger
import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class CustomGson @Inject constructor() {

    init {
        PrintUtils.printLog("CustomGson class invoked")
    }

}