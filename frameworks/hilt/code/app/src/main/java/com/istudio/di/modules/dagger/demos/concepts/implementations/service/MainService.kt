package com.istudio.di.modules.dagger.demos.concepts.implementations.service

import com.istudio.di.modules.dagger.demos.concepts.implementations.service.types.MessageService
import javax.inject.Inject

class MainService @Inject constructor(
    private val msgService : MessageService
) {

    fun initiateAction(){
        msgService.sendTo(
            to="Reciever", from = "Sender",
            body = "Content", subject = "something"
        )
    }

}