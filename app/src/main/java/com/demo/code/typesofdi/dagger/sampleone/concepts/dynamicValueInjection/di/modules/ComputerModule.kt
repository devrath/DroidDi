package com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.di.modules

import com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.computerParts.Ram
import com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.computerParts.Storage
import dagger.Module
import dagger.Provides

@Module
class ComputerModule constructor(var isTwoGbRam : Boolean = false,
                                 var sizeInGB : Int = 0){

    @Provides
    fun getRamModule() : Ram {
        return Ram(isTwoGbRam)
    }

    @Provides
    fun getStorageModule() : Storage {
        return Storage(sizeInGB)
    }

}