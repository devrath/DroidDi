package com.istudio.di.modules.hilt.demos.qualifiers_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityHiltInterfaceInjectionBinding
import com.istudio.di.databinding.ActivityHiltQualifiersBinding
import com.istudio.di.modules.hilt.demos.qualifiers_demo.implementations.Cat
import com.istudio.di.modules.hilt.demos.qualifiers_demo.qualifiers.AmericanCat
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltQualifiersActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltQualifiersBinding

    @AmericanCat
    @Inject lateinit var cat : Cat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltQualifiersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            initiateId.setOnClickListener {
                println(cat.getName())
            }
        }
    }
}