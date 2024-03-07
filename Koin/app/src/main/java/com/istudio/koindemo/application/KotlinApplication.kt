package com.istudio.koindemo.application

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KotlinApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            // Reference Android context
            androidContext(this@KotlinApplication)
            // Log Koin into Android logger
            androidLogger()
            // use properties from assets/koin.properties
            androidFileProperties()
        }
    }
}