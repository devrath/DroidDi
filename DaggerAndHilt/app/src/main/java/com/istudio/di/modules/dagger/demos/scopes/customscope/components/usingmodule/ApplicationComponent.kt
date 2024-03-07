package com.istudio.di.modules.dagger.demos.scopes.customscope.components.usingmodule

import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingmodule.AnalyticsService
import com.istudio.di.modules.dagger.demos.scopes.customscope.modules.usingmodule.AnalyticsServiceModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsServiceModule::class])
interface ApplicationComponent {
    fun provideAnalytics() : AnalyticsService
}