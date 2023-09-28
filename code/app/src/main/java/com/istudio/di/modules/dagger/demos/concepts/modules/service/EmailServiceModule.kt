package com.istudio.di.modules.dagger.demos.concepts.modules.service

import com.istudio.di.modules.dagger.demos.concepts.implementations.service.types.EmailService
import com.istudio.di.modules.dagger.demos.concepts.implementations.service.types.NotificationService
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck


@Module
@DisableInstallInCheck
class EmailServiceModule {

    @Provides
    fun provideEmailService() : NotificationService {
        return EmailService();
    }

}