package com.istudio.di.modules.dagger.demos.multibindings.intomap.modules

import com.istudio.di.modules.dagger.demos.multibindings.intomap.implementation.Ballpen
import com.istudio.di.modules.dagger.demos.multibindings.intomap.implementation.Inkpen
import com.istudio.di.modules.dagger.demos.multibindings.intomap.implementation.Pen
import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.Multibinds

@Module
@DisableInstallInCheck
interface PenModule {

    @Multibinds
    fun multibindsStringProviders(): Map<Class<*>, Pen>

    @Binds
    @IntoMap
    @ClassKey(Inkpen::class)
    fun provideInkPen(pen : Inkpen) : Pen

    @Binds
    @IntoMap
    @ClassKey(Ballpen::class)
    fun provideBallPen(pen : Ballpen) : Pen

}