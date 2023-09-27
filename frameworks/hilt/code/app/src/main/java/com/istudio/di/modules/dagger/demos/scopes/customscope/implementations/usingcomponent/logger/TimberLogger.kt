package com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.logger

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class TimberLogger {
    fun print(message: String) {
        PrintUtils.printLog(message)
    }
}