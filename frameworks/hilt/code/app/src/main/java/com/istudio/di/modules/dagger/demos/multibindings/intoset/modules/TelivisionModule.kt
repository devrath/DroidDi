package com.istudio.di.modules.dagger.demos.multibindings.intoset.modules

import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Lg
import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Samsung
import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Telivision
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
abstract class TelivisionModule {

   /* @Binds
    abstract fun providesSamsungTv(implementation : Samsung) : Telivision

    @Binds
    abstract fun providesLgTv(implementation : Lg) : Telivision*/

}