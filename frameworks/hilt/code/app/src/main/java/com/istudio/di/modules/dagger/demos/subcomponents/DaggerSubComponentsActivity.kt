package com.istudio.di.modules.dagger.demos.subcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerScopesBinding
import com.istudio.di.databinding.ActivityDaggerSubComponentsBinding
import com.istudio.di.modules.dagger.demos.concepts.DaggerConceptsActivity
import com.istudio.di.modules.dagger.demos.subcomponents.builder.DaggerSubComponentsBuilderActivity
import com.istudio.di.modules.dagger.demos.subcomponents.factory.DaggerSubComponentsFactoryActivity
import com.istudio.di.utils.startActivity

class DaggerSubComponentsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerSubComponentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerSubComponentsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            subComponentFactoryId.setOnClickListener {
                startActivity<DaggerSubComponentsFactoryActivity>()
            }
            subComponentBuilderId.setOnClickListener {
                startActivity<DaggerSubComponentsBuilderActivity>()
            }
        }
    }

}