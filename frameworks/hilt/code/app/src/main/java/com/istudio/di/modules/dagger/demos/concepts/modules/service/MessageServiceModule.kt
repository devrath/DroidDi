package com.istudio.di.modules.dagger.demos.concepts.modules.service

import com.istudio.di.modules.dagger.demos.concepts.implementations.service.types.MessageService
import com.istudio.di.modules.dagger.demos.concepts.implementations.service.types.NotificationService
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck

@Module
@DisableInstallInCheck
class MessageServiceModule {

    @Provides
    fun provideMessageService(messageTag: String) : NotificationService {
        return MessageService(messageTag)
    }

}