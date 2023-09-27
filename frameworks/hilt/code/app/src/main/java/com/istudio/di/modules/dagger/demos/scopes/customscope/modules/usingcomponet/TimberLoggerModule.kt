package com.istudio.di.modules.dagger.demos.scopes.customscope.modules.usingcomponet

import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.logger.TimberLogger
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class TimberLoggerModule {
    @Provides
    fun provideTimberLogger(): TimberLogger{
        return TimberLogger()
    }

}