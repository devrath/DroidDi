package com.istudio.di.modules.dagger.demos.multibindings.elementsintoset

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerMultiBindingElementsIntoSetBinding
import com.istudio.di.databinding.ActivityDaggerMultiBindingIntoSetBinding
import com.istudio.di.databinding.ActivityDaggerMultiBindingsSelectionBinding

class DaggerMultiBindingElementsIntoSetActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerMultiBindingElementsIntoSetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerMultiBindingElementsIntoSetBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        binding.apply {
            initiateId.setOnClickListener {

            }
        }
    }
}