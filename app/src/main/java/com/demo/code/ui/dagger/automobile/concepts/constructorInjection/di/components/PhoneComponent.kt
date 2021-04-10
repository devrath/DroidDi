package com.demo.code.ui.dagger.automobile.concepts.constructorInjection.di.components

import com.demo.code.ui.dagger.automobile.concepts.constructorInjection.phoneParts.Phone
import dagger.Component

@Component
interface PhoneComponent {
   fun getPhone() : Phone
}