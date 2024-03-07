package com.istudio.di.modules.dagger.demos.scopes.customscope.modules.usingmodule

import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingmodule.ImageProcessingService
import com.istudio.di.modules.dagger.demos.scopes.customscope.scopes.ActivityScope
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class ImageProcessingServiceModule {

    @ActivityScope
    @Provides
    fun provideImageProcessingService() : ImageProcessingService {
        return ImageProcessingService();
    }


}