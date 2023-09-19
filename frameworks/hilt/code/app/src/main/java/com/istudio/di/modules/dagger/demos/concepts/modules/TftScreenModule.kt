package com.istudio.di.modules.dagger.demos.concepts.modules

import com.istudio.di.modules.dagger.demos.concepts.implementations.computer.screen.ComputerScreen
import com.istudio.di.modules.dagger.demos.concepts.implementations.computer.screen.LcdScreen
import com.istudio.di.modules.dagger.demos.concepts.implementations.computer.screen.TftScreen
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class TftScreenModule {

    @Provides
    fun providesTftScreen(tftScreen : TftScreen) : ComputerScreen {
        return tftScreen;
    }

}