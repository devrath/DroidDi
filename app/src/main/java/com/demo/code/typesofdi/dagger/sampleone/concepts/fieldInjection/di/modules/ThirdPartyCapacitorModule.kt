package com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.di.modules

import com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.tvParts.ThirdPartyCapacitor
import dagger.Module
import dagger.Provides

@Module
class ThirdPartyCapacitorModule {
    @Provides
    fun getThirdPartyCapacitor() : ThirdPartyCapacitor {
        return ThirdPartyCapacitor()
    }
}