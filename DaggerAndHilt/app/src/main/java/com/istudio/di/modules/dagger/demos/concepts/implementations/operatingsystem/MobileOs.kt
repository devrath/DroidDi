package com.istudio.di.modules.dagger.demos.concepts.implementations.operatingsystem

import com.istudio.di.modules.dagger.demos.concepts.implementations.operatingsystem.type.OS
import com.istudio.di.modules.dagger.demos.concepts.qualifiers.os.AndroidOsQualifier
import javax.inject.Inject

class MobileOs @Inject constructor(
    @AndroidOsQualifier private val osType : OS
) {

    fun displayOSType(){
        osType.getOsType()
    }

}