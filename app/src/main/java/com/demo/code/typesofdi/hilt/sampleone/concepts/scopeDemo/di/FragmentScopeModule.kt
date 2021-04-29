package com.demo.code.typesofdi.hilt.sampleone.concepts.scopeDemo.di

import com.demo.code.typesofdi.hilt.sampleone.concepts.scopeDemo.objects.FragmentScopedObject
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.scopes.FragmentScoped

@Module
@InstallIn(FragmentComponent::class)
class FragmentScopeModule {
    @FragmentScoped
    @Provides
    fun providesActivityScopeDemo() : FragmentScopedObject {
        return FragmentScopedObject()
    }

}