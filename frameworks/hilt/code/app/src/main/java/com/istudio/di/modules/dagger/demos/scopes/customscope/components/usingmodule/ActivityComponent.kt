package com.istudio.di.modules.dagger.demos.scopes.customscope.components.usingmodule

import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingmodule.AnalyticsService
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingmodule.ImageProcessingService
import com.istudio.di.modules.dagger.demos.scopes.customscope.modules.usingmodule.ImageProcessingServiceModule
import com.istudio.di.modules.dagger.demos.scopes.customscope.scopes.ActivityScope
import dagger.Component


@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ImageProcessingServiceModule::class])
interface ActivityComponent {

    fun provideAnalytics() : AnalyticsService
    fun provideImageProcessingService() : ImageProcessingService

}