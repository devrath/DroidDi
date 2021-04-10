package com.demo.code.typesofdi.dagger.sampleone.concepts.constructorInjection.di.components

import com.demo.code.typesofdi.dagger.sampleone.concepts.constructorInjection.phoneParts.Phone
import dagger.Component

@Component
interface PhoneComponent {
   fun getPhone() : Phone
}