package com.istudio.di.modules.dagger.demos.scopes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerScopesBinding
import com.istudio.di.modules.dagger.demos.scopes.applicationscope.ApplicationScopeActivity
import com.istudio.di.modules.dagger.demos.scopes.introdemo.IntroScopeDemoActivity
import com.istudio.di.utils.startActivity

class DaggerScopesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerScopesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerScopesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            normalIntroDemoScopeId.setOnClickListener { startActivity<IntroScopeDemoActivity>() }
            applicationScopeId.setOnClickListener { startActivity<ApplicationScopeActivity>() }
        }
    }


}