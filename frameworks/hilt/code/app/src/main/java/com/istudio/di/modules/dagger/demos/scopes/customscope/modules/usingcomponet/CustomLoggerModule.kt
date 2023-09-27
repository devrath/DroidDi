package com.istudio.di.modules.dagger.demos.scopes.customscope.modules.usingcomponet

import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.logger.CustomLogger
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.logger.Logger
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.logger.TimberLogger
import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
abstract class CustomLoggerModule {
    @Binds
    abstract fun provideTimberLogger(logger : CustomLogger): Logger

}
