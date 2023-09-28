package com.istudio.di.modules.dagger.demos.multibindings.intoset.modules

import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Lg
import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Samsung
import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Telivision
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoSet
import dagger.multibindings.Multibinds

@Module
@DisableInstallInCheck
interface TelivisionModule {

    @Binds
    @IntoSet
    fun providesSamsungTv(implementation : Samsung) : Telivision

    @Binds
    @IntoSet
    fun providesLgTv(implementation : Lg) : Telivision

}