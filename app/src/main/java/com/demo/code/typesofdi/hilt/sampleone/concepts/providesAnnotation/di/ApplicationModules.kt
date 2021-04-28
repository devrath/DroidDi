package com.demo.code.typesofdi.hilt.sampleone.concepts.providesAnnotation.di

import com.demo.code.typesofdi.hilt.sampleone.concepts.providesAnnotation.whatsappParts.Glide
import com.demo.code.typesofdi.hilt.sampleone.concepts.providesAnnotation.whatsappParts.Retrofit
import com.demo.code.typesofdi.hilt.sampleone.concepts.providesAnnotation.whatsappParts.WhatsApp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
class ApplicationModules {

    @Provides
    fun provideRetrofit() = Retrofit()

    @Provides
    fun provideGlide() = Glide()

    @Provides
    fun provideWhatsApp(retrofit: Retrofit,glide : Glide) = WhatsApp(retrofit,glide)

}