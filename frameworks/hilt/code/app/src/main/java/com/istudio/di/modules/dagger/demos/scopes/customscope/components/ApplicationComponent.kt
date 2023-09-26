package com.istudio.di.modules.dagger.demos.scopes.customscope.components

import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.AnalyticsService
import com.istudio.di.modules.dagger.demos.scopes.customscope.modules.AnalyticsServiceModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsServiceModule::class])
interface ApplicationComponent {
    fun provideAnalytics() : AnalyticsService
}