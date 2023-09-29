package com.istudio.di.modules.hilt.demos.injection.interfaceInject.modules

import com.istudio.di.modules.hilt.demos.injection.interfaceInject.implementation.BuddhismReligion
import com.istudio.di.modules.hilt.demos.injection.interfaceInject.implementation.Hinduism
import com.istudio.di.modules.hilt.demos.injection.interfaceInject.implementation.JainismReligion
import com.istudio.di.modules.hilt.demos.injection.interfaceInject.implementation.Religion
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
object ReligionModule {

    @Provides
    fun providesHinduism() : Hinduism {
        return Hinduism()
    }


    @Provides
    fun providesReligion() : Religion {
        return BuddhismReligion()
    }

}