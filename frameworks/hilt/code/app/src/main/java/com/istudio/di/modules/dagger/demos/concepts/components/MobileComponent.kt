package com.istudio.di.modules.dagger.demos.concepts.components

import com.istudio.di.modules.dagger.demos.concepts.DaggerConceptsActivity
import dagger.Component

@Component
interface MobileComponent {

    fun inject(activity: DaggerConceptsActivity)

}