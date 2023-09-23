package com.istudio.di.modules.dagger.demos.concepts.components.os

import com.istudio.di.modules.dagger.demos.concepts.implementations.operatingsystem.MobileOs
import com.istudio.di.modules.dagger.demos.concepts.modules.os.AndroidOsModule
import com.istudio.di.modules.dagger.demos.concepts.modules.os.IosOsModule
import dagger.Component

@Component(modules = [AndroidOsModule::class,IosOsModule::class])
interface OsComponent {
    fun getMobileOs() : MobileOs
}