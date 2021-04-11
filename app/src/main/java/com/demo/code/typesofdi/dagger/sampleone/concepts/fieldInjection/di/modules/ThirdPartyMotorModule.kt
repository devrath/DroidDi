package com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.di.modules

import com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.tvParts.ThirdPartyCapacitor
import com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.tvParts.ThirdPartyMotor
import dagger.Module
import dagger.Provides


@Module
class ThirdPartyMotorModule {
    @Provides
    fun getThirdPartyMotor(thirdPartyCapacitor: ThirdPartyCapacitor) : ThirdPartyMotor{
        return ThirdPartyMotor(thirdPartyCapacitor)
    }
}