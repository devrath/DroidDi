package com.istudio.di.modules.dagger.demos.concepts.components.tvremote

import com.istudio.di.modules.dagger.demos.concepts.implementations.tvremote.SamsungRemote
import com.istudio.di.modules.dagger.demos.concepts.modules.tvremote.SamsungRemoteModule
import dagger.Component

@Component(modules = [SamsungRemoteModule::class])
interface RemoteComponent {

    fun getMobile() : SamsungRemote

}