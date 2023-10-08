package com.istudio.di.modules.dagger.demos.subcomponents.factory.implementations.phone

import com.istudio.di.modules.dagger.demos.subcomponents.factory.implementations.User
import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class Phone @Inject constructor(
    val battery: Battery, val screen: Screen, val user : User
) {

    fun startPhone(){
        PrintUtils.printLog("Phone is started for the user ${user.name}")
    }

}