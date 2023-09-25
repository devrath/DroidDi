package com.istudio.di.modules.dagger.demos.scopes.introdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.modules.dagger.demos.scopes.introdemo.components.DaggerConnectionComponent
import com.istudio.di.modules.dagger.demos.scopes.introdemo.implementations.connection.Connection
import javax.inject.Inject

class IntroScopeDemoActivity : AppCompatActivity() {

    @Inject lateinit var connInterface1 : Connection
    @Inject lateinit var connInterface2 : Connection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_scope_demo)

        val comp = DaggerConnectionComponent.builder().build()
        comp.inject(this@IntroScopeDemoActivity)

        println("Injection completed")

    }


}