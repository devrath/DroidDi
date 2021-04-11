package com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R
import com.demo.code.databinding.BindsAnnotationFragmentBinding
import com.demo.code.databinding.ConstructorInjectionFragmentBinding
import com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.di.components.DaggerCarComponent
import com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.vehicleParts.Car
import com.demo.code.typesofdi.dagger.sampleone.concepts.constructorInjection.di.components.DaggerPhoneComponent
import javax.inject.Inject

class BindsAnnotationFragment : Fragment() {

    companion object {
        fun newInstance() = BindsAnnotationFragment()
    }

    private lateinit var viewModel: BindsAnnotationViewModel

    private lateinit var _binding: BindsAnnotationFragmentBinding
    private val binding get() = _binding


    @Inject
    lateinit var car : Car

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = BindsAnnotationFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BindsAnnotationViewModel::class.java)
        DaggerCarComponent.builder().build().inject(this)
        binding.apply {
            actionId.setOnClickListener {
                car.drive()
            }
        }
    }

}