package com.demo.code.typesofdi.hilt.sampleone.concepts.contextUseDemo.di

import android.content.Context
import com.demo.code.typesofdi.hilt.sampleone.concepts.contextUseDemo.vehicleParts.ApplicationContextObject
import com.demo.code.typesofdi.hilt.sampleone.concepts.contextUseDemo.vehicleParts.ActivityContextObject
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(FragmentComponent::class)
class ContextModule {

    @Provides
    fun providesActivityContext(@ActivityContext context: Context) : ActivityContextObject {
        return ActivityContextObject(context)
    }

    @Provides
    fun providesApplicationContext(@ApplicationContext context: Context) : ApplicationContextObject {
        return ApplicationContextObject(context)
    }

}