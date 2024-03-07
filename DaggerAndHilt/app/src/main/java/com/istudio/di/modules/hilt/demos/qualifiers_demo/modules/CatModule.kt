package com.istudio.di.modules.hilt.demos.qualifiers_demo.modules

import com.istudio.di.modules.hilt.demos.qualifiers_demo.implementations.AmericanCatImpl
import com.istudio.di.modules.hilt.demos.qualifiers_demo.implementations.Cat
import com.istudio.di.modules.hilt.demos.qualifiers_demo.implementations.PersianCatImpl
import com.istudio.di.modules.hilt.demos.qualifiers_demo.qualifiers.AmericanCat
import com.istudio.di.modules.hilt.demos.qualifiers_demo.qualifiers.PersianCat
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class CatModule {

    @Binds
    @AmericanCat
    abstract fun provideAmericanCat(impl: AmericanCatImpl) : Cat

    @Binds
    @PersianCat
    abstract fun providePersianCat(impl : PersianCatImpl) : Cat


}