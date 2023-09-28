package com.istudio.di.modules.dagger.demos.multibindings.intoset

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.istudio.di.databinding.ActivityDaggerMultiBindingIntoSetBinding
import com.istudio.di.modules.dagger.demos.multibindings.intoset.components.DaggerTelivisionComponent
import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Lg
import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Samsung
import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Telivision
import javax.inject.Inject

class DaggerMultiBindingIntoSetActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerMultiBindingIntoSetBinding

    @Inject lateinit var telivision: Set<@JvmSuppressWildcards Telivision>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerMultiBindingIntoSetBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            initiateId.setOnClickListener {
                // Inject the component into the activity
                val comp = DaggerTelivisionComponent.builder().build()
                comp.inject(this@DaggerMultiBindingIntoSetActivity)
                // Print the entire set
                println(telivision)
                // Iterate the set of objects
                telivision.forEach { tv ->
                    if(tv is Samsung){
                        // Access Samsung specific functionalities
                        println(tv.name())
                    }else if(tv is Lg){
                        // Access Lg specific functionalities
                        println(tv.name())
                    }
                }
            }
        }
    }

}