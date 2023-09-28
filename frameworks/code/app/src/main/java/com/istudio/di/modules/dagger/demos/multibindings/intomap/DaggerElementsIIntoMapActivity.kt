package com.istudio.di.modules.dagger.demos.multibindings.intomap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.istudio.di.databinding.ActivityDaggerElementsIntoMapBinding
import com.istudio.di.modules.dagger.demos.multibindings.intomap.components.DaggerPenComponent
import com.istudio.di.modules.dagger.demos.multibindings.intomap.implementation.Pen
import javax.inject.Inject

class DaggerElementsIIntoMapActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerElementsIntoMapBinding

    @Inject
    lateinit var pen: Map<Class<*>,@JvmSuppressWildcards Pen>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerElementsIntoMapBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            initiateId.setOnClickListener {
                // Inject the component into the activity

                val comp = DaggerPenComponent.builder()
                            .build().inject(this@DaggerElementsIIntoMapActivity)

                for ((key, value) in pen) {
                    // Access specific functionalities
                    println("$key = $value")
                }
            }
        }
    }

}