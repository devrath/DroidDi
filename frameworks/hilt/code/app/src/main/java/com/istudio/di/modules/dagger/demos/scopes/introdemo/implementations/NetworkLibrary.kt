package com.istudio.di.modules.dagger.demos.scopes.introdemo.implementations

import com.istudio.di.modules.dagger.demos.scopes.introdemo.implementations.connection.Connection
import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class NetworkLibrary @Inject constructor(
    val connection: Connection
) {

    fun initilizeNetworkLibrary() {
        connection.connect("www.client.com")
        PrintUtils.printLog("Network library is initialized")
    }


}
