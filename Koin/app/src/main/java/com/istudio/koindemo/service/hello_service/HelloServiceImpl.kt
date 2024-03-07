package com.istudio.koindemo.service.hello_service

class HelloServiceImpl : HelloService {

    override fun doSomething(): String {
        return "Hello Service, Koin!"
    }

}