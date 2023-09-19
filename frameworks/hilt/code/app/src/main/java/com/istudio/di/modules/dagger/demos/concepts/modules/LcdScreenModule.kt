package com.istudio.di.modules.dagger.demos.concepts.modules

import com.istudio.di.modules.dagger.demos.concepts.implementations.computer.screen.ComputerScreen
import com.istudio.di.modules.dagger.demos.concepts.implementations.computer.screen.LcdScreen
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class LcdScreenModule {

    @Provides
    fun providesLcdScreen(lcdScreen : LcdScreen) : ComputerScreen{
        return lcdScreen;
    }

}