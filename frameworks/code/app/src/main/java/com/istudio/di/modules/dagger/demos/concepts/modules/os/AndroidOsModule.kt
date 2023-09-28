package com.istudio.di.modules.dagger.demos.concepts.modules.os

import com.istudio.di.modules.dagger.demos.concepts.implementations.operatingsystem.type.AndroidOs
import com.istudio.di.modules.dagger.demos.concepts.implementations.operatingsystem.type.OS
import com.istudio.di.modules.dagger.demos.concepts.qualifiers.os.AndroidOsQualifier
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck


@Module
@DisableInstallInCheck
class AndroidOsModule {

    @AndroidOsQualifier
    @Provides
    fun providesAndroidOs() : OS {
        return AndroidOs()
    }

}