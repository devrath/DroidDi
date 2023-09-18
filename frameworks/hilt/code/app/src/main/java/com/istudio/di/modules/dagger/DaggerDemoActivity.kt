package com.istudio.di.modules.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerDemoBinding
import com.istudio.di.databinding.ActivityHiltDemoBinding
import com.istudio.di.modules.dagger.demos.concepts.DaggerConceptsActivity
import com.istudio.di.modules.hilt.demos.clientserver.presentation.compose.activity.HiltNetworkComposeApiActivity
import com.istudio.di.modules.hilt.demos.clientserver.presentation.xml.activity.HiltNetworkXmlApiActivity
import com.istudio.di.utils.startActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DaggerDemoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerDemoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            daggerConceptsPracticalId.setOnClickListener { startActivity<DaggerConceptsActivity>() }
        }
    }


}