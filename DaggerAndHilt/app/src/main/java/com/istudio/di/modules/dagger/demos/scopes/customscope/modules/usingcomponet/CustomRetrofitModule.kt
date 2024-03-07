package com.istudio.di.modules.dagger.demos.scopes.customscope.modules.usingcomponet

import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.CustomGson
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.CustomOkHttp
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.CustomRetrofit
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingmodule.AnalyticsService
import com.istudio.di.modules.dagger.demos.scopes.customscope.scopes.ActivityScope
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck


@Module
@DisableInstallInCheck
class CustomRetrofitModule {

    @ActivityScope
    @Provides
    fun providesRetrofit(
        serializer : CustomGson, networkCore : CustomOkHttp,
        analyticsService: AnalyticsService
    ) : CustomRetrofit {
        return CustomRetrofit(serializer,networkCore,analyticsService)
    }


}