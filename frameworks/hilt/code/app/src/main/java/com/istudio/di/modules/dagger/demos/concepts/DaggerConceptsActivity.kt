package com.istudio.di.modules.dagger.demos.concepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerConceptsBinding
import com.istudio.di.databinding.ActivityDaggerDemoBinding
import dagger.hilt.android.AndroidEntryPoint

class DaggerConceptsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerConceptsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerConceptsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}