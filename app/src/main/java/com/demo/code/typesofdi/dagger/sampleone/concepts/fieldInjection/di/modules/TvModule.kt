package com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.di.modules

import com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.tvParts.ThirdPartyMotor
import com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.tvParts.Tv
import dagger.Module
import dagger.Provides

@Module
class TvModule {
    @Provides
    fun getTv(thirdPartyMotor: ThirdPartyMotor) : Tv {
        return Tv(thirdPartyMotor)
    }
}