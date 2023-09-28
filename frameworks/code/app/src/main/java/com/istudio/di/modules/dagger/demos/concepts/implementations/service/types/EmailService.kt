package com.istudio.di.modules.dagger.demos.concepts.implementations.service.types

import com.istudio.di.utils.PrintUtils

class EmailService : NotificationService {
    override fun sendTo(
        to: String, from: String,
        subject: String, body: String
    ) {
        PrintUtils.printLog("Sending is successfully via Email Service")
    }

}