package com.demo.code.typesOfDi.dagger.SampleOne.concepts.constructorInjection.di.components

import com.demo.code.typesOfDi.dagger.SampleOne.concepts.constructorInjection.phoneParts.Phone
import dagger.Component

@Component
interface PhoneComponent {
   fun getPhone() : Phone
}