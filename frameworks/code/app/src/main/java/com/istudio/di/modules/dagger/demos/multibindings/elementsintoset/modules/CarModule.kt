package com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.modules

import com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.implementation.Car
import com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.implementation.Hyundai
import com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.implementation.Maruti
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import dagger.multibindings.ElementsIntoSet

@Module
@DisableInstallInCheck
interface CarModule {

    companion object {
        @Provides
        @ElementsIntoSet
        fun provideCars(): Set<@JvmSuppressWildcards Car> {
            return setOf(
                Hyundai(),
                Maruti()
            )
        }
    }

}