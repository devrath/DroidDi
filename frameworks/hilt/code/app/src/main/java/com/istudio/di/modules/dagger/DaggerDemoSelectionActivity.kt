package com.istudio.di.modules.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.databinding.ActivityDaggerDemoSelectionBinding
import com.istudio.di.modules.dagger.demos.concepts.DaggerConceptsActivity
import com.istudio.di.modules.dagger.demos.multibindings.DaggerMultiBindingsSelectionActivity
import com.istudio.di.modules.dagger.demos.scopes.DaggerScopesActivity
import com.istudio.di.modules.dagger.demos.subcomponents.DaggerSubComponentsActivity
import com.istudio.di.utils.startActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DaggerDemoSelectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerDemoSelectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerDemoSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            daggerConceptsPracticalId.setOnClickListener { startActivity<DaggerConceptsActivity>() }
            daggerScopingConceptsId.setOnClickListener { startActivity<DaggerScopesActivity>() }
            daggerSubComponentsId.setOnClickListener { startActivity<DaggerSubComponentsActivity>() }
            daggerMultiBindingsId.setOnClickListener { startActivity<DaggerMultiBindingsSelectionActivity>() }
        }
    }


}