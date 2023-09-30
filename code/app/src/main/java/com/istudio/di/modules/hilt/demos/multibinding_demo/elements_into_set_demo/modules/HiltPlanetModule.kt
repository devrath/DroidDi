package com.istudio.di.modules.hilt.demos.multibinding_demo.elements_into_set_demo.modules

import com.istudio.di.modules.hilt.demos.multibinding_demo.elements_into_set_demo.implementations.Earth
import com.istudio.di.modules.hilt.demos.multibinding_demo.elements_into_set_demo.implementations.Mars
import com.istudio.di.modules.hilt.demos.multibinding_demo.elements_into_set_demo.implementations.Planet
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ElementsIntoSet

@InstallIn(SingletonComponent::class)
@Module
object HiltPlanetModule {
    @Provides
    @ElementsIntoSet
    fun providePlanets(): Set<@JvmSuppressWildcards Planet> {
        return setOf(
            Earth(),
            Mars()
        )
    }
}
