package com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R
import com.demo.code.databinding.ConstructorInjectionFragmentBinding
import com.demo.code.databinding.DynamicValueInjectionFragmentBinding
import com.demo.code.typesofdi.dagger.sampleone.concepts.constructorInjection.di.components.DaggerPhoneComponent
import com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.computerParts.Computer
import com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.di.components.DaggerComputerComponent
import com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.di.modules.ComputerModule
import javax.inject.Inject

class DynamicValueInjectionFragment : Fragment() {

    companion object {
        fun newInstance() = DynamicValueInjectionFragment()
    }

    @Inject
    lateinit var computer : Computer

    private lateinit var _binding: DynamicValueInjectionFragmentBinding
    private val binding get() = _binding

    private lateinit var viewModel: DynamicValueInjectionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DynamicValueInjectionFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DynamicValueInjectionViewModel::class.java)

        binding.apply {
            actionId.setOnClickListener {

                // Build the phone
                val component = DaggerComputerComponent.builder()
                    .computerModule(ComputerModule(isTwoGbRam = true,sizeInGB = 250)).build()
                component.inject(this@DynamicValueInjectionFragment)


                // Invoke function of Computer
                computer.initilize()

            }
        }

    }

}