package com.istudio.di.modules.dagger.demos.concepts.implementations.service.types

interface NotificationService {
    fun sendTo(to:String,from:String,subject:String,body:String)
}