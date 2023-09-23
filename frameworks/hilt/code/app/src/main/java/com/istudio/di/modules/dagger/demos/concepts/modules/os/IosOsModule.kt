package com.istudio.di.modules.dagger.demos.concepts.modules.os

import com.istudio.di.modules.dagger.demos.concepts.implementations.operatingsystem.type.AppleOs
import com.istudio.di.modules.dagger.demos.concepts.implementations.operatingsystem.type.OS
import com.istudio.di.modules.dagger.demos.concepts.qualifiers.os.IosOsQualifier
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class IosOsModule {

    @IosOsQualifier
    @Provides
    fun providesAndroidOs() : OS {
        return AppleOs()
    }

}