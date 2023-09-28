package com.istudio.di.modules.dagger.demos.multibindings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerDemoSelectionBinding
import com.istudio.di.databinding.ActivityDaggerMultiBindingsSelectionBinding
import com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.DaggerMultiBindingElementsIntoSetActivity
import com.istudio.di.modules.dagger.demos.multibindings.intoset.DaggerMultiBindingIntoSetActivity
import com.istudio.di.utils.startActivity

class DaggerMultiBindingsSelectionActivity : AppCompatActivity() {


    private lateinit var binding: ActivityDaggerMultiBindingsSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerMultiBindingsSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            usingIntoSetId.setOnClickListener {
                startActivity<DaggerMultiBindingIntoSetActivity>()
            }
            elementsIntoSetId.setOnClickListener {
                startActivity<DaggerMultiBindingElementsIntoSetActivity>()
            }
        }
    }

}