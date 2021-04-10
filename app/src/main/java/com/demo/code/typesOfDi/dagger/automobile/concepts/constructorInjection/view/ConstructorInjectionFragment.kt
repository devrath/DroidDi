package com.demo.code.typesOfDi.dagger.automobile.concepts.constructorInjection.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.databinding.ConstructorInjectionFragmentBinding
import com.demo.code.typesOfDi.dagger.automobile.concepts.constructorInjection.di.components.DaggerPhoneComponent

class ConstructorInjectionFragment : Fragment() {

    companion object {
        fun newInstance() = ConstructorInjectionFragment()
    }

    private lateinit var _binding: ConstructorInjectionFragmentBinding
    private val binding get() = _binding

    private lateinit var viewModel: ConstructorInjectionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ConstructorInjectionFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ConstructorInjectionViewModel::class.java)

        binding.apply {
            actionId.setOnClickListener {
                // Build the phone
                val phoneComponent = DaggerPhoneComponent.builder().build()
                val phone = phoneComponent.getPhone()
                phone.initialize()
            }
        }
    }

}