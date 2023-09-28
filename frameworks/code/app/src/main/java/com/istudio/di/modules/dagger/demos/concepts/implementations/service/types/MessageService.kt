package com.istudio.di.modules.dagger.demos.concepts.implementations.service.types

import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class MessageService @Inject constructor(
    private val messageTag:String
) : NotificationService {

    override fun sendTo(
        to: String, from: String,
        subject: String, body: String
    ) {
        PrintUtils.printLog("Sending is successfully via Message Service with tag $messageTag")
    }

}