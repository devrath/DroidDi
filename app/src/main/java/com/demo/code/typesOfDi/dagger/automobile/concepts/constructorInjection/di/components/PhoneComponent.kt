package com.demo.code.typesOfDi.dagger.automobile.concepts.constructorInjection.di.components

import com.demo.code.typesOfDi.dagger.automobile.concepts.constructorInjection.phoneParts.Phone
import dagger.Component

@Component
interface PhoneComponent {
   fun getPhone() : Phone
}