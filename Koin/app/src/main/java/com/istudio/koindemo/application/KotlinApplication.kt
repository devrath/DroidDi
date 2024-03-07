package com.istudio.koindemo.application

import android.app.Application
import org.koin.core.context.startKoin

class KotlinApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            //modules(appModule)
        }
    }
}