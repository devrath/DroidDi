package com.istudio.di.modules.dagger.demos.concepts.components.service

import com.istudio.di.modules.dagger.demos.concepts.implementations.service.MainService
import com.istudio.di.modules.dagger.demos.concepts.modules.service.MessageServiceModule
import dagger.BindsInstance
import dagger.Component

@Component(modules = [MessageServiceModule::class])
interface MessageServiceComponent {

    fun getMainService() : MainService

    @Component.Factory
    interface Factory{
        fun create(
            @BindsInstance messageTag:String
        ) : MessageServiceComponent
    }

}