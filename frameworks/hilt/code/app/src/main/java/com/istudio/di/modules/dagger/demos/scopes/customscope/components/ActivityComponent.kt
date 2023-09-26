package com.istudio.di.modules.dagger.demos.scopes.customscope.components

import com.istudio.di.modules.dagger.demos.scopes.customscope.CustomScopeActivity
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.AnalyticsService
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.ImageProcessingService
import com.istudio.di.modules.dagger.demos.scopes.customscope.modules.ImageProcessingServiceModule
import com.istudio.di.modules.dagger.demos.scopes.customscope.scopes.ActivityScope
import dagger.Component


@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ImageProcessingServiceModule::class])
interface ActivityComponent {

    fun provideAnalytics() : AnalyticsService
    fun provideImageProcessingService() : ImageProcessingService

}