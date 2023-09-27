package com.istudio.di.modules.dagger.demos.scopes.customscope.components.usingcomponent

import com.istudio.di.modules.dagger.demos.scopes.applicationscope.scope.ApplicationScope
import com.istudio.di.modules.dagger.demos.scopes.customscope.CustomScopeActivity
import com.istudio.di.modules.dagger.demos.scopes.customscope.components.usingmodule.ApplicationComponent
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.logger.CustomLogger
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.logger.TimberLogger
import com.istudio.di.modules.dagger.demos.scopes.customscope.modules.usingcomponet.CustomLoggerModule
import com.istudio.di.modules.dagger.demos.scopes.customscope.modules.usingcomponet.CustomRetrofitModule
import com.istudio.di.modules.dagger.demos.scopes.customscope.modules.usingcomponet.TimberLoggerModule
import com.istudio.di.modules.dagger.demos.scopes.customscope.scopes.ActivityScope
import dagger.BindsInstance
import dagger.Component


@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [
        CustomRetrofitModule::class,
        TimberLoggerModule::class,
        CustomLoggerModule::class
    ]
)
interface NetworkComponent {

    fun inject(activity : CustomScopeActivity)

    @Component.Factory
    interface Factory {
        fun create(
            applicationComponent: ApplicationComponent
        ) : NetworkComponent
    }

}