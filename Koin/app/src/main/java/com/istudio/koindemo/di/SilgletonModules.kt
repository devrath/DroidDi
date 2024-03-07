package com.istudio.koindemo.di

import com.istudio.koindemo.service.hello_service.HelloService
import com.istudio.koindemo.service.hello_service.HelloServiceImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val singletonService = module {
    singleOf<HelloService>(::HelloServiceImpl)
}