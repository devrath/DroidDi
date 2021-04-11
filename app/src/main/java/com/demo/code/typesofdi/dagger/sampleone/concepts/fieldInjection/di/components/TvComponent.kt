package com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.di.components

import com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.di.modules.ThirdPartyCapacitorModule
import com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.di.modules.ThirdPartyMotorModule
import com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.view.FieldInjectionFragment
import com.demo.code.typesofdi.dagger.sampleone.selection.AutomobileFragment
import dagger.Component

@Component(modules = [ThirdPartyMotorModule::class, ThirdPartyCapacitorModule::class])
interface TvComponent {
   fun inject(fieldInjectionFragment : FieldInjectionFragment)
}