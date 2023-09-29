package com.istudio.di.modules.hilt.demos.scoping_demo.modules

import com.istudio.di.modules.hilt.demos.scoping_demo.implementations.DownloaderService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Singleton

@InstallIn(ActivityComponent::class)
@Module
object HiltActivityScopingModule {

    @ActivityScoped
    @Provides
    fun providesDownloader() : DownloaderService {
        return DownloaderService()
    }

}