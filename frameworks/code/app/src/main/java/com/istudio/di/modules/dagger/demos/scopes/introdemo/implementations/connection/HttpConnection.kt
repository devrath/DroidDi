package com.istudio.di.modules.dagger.demos.scopes.introdemo.implementations.connection

import com.istudio.di.modules.dagger.demos.scopes.introdemo.implementations.connection.Connection
import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class HttpConnection @Inject constructor() : Connection {
    override fun connect(endpoint: String) {
        PrintUtils.printLog("HttpConnection made")
    }

}