package com.istudio.di.modules.dagger.demos.multibindings.intoset

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerMultiBindingIntoSetBinding
import com.istudio.di.databinding.ActivityDaggerMultiBindingsSelectionBinding

class DaggerMultiBindingIntoSetActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerMultiBindingIntoSetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerMultiBindingIntoSetBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            initiateId.setOnClickListener {

            }
        }
    }

}