package com.istudio.di.modules.dagger.demos.concepts.modules.tvremote

import com.istudio.di.modules.dagger.demos.concepts.implementations.tvremote.SamsungRemote
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class SamsungRemoteModule {
    @Provides
    fun provideSamsungRemote(): SamsungRemote {
        return SamsungRemote()
    }

}