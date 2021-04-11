package com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.di.components

import com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.di.module.PetrolEngineModule
import com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.di.module.WheelsModule
import com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.view.BindsAnnotationFragment
import com.demo.code.typesofdi.dagger.sampleone.selection.AutomobileFragment
import dagger.Component


@Component(modules = [PetrolEngineModule::class, WheelsModule::class])
interface CarComponent {
   fun inject(bindsAnnotationFragment : BindsAnnotationFragment)
}