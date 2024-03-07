package com.istudio.di.modules.dagger.demos.scopes.customscope.modules.usingmodule

import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingmodule.AnalyticsService
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Singleton

@Module
@DisableInstallInCheck
class AnalyticsServiceModule {

    @Singleton
    @Provides
    fun provideAnalyticsService() : AnalyticsService {
        return AnalyticsService()
    }

}