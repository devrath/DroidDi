package com.istudio.di.modules.dagger.demos.scopes.applicationscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R

class ApplicationScopeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_application_scope)
    }
}