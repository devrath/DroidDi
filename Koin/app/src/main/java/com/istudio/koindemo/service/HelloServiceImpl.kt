package com.istudio.koindemo.service

class HelloServiceImpl : HelloService {

    override fun doSomething(): String {
        return "Hello Service, Koin!"
    }

}