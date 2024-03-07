package com.istudio.koindemo.di

import com.istudio.koindemo.service.HelloService
import com.istudio.koindemo.service.HelloServiceImpl
import org.koin.dsl.module

val singletonService = module {
    single<HelloService> { HelloServiceImpl() }
}