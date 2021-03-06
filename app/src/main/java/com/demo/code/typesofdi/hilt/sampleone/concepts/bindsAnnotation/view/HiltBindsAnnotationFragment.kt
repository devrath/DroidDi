package com.demo.code.typesofdi.hilt.sampleone.concepts.bindsAnnotation.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R
import com.demo.code.databinding.HiltBindAnnotationFragmentBinding
import com.demo.code.databinding.HiltConstructorFieldInjectionDemoFragmentBinding
import com.demo.code.typesofdi.hilt.sampleone.concepts.bindsAnnotation.vehicleParts.Car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltBindsAnnotationFragment : Fragment() {

    companion object {
        fun newInstance() = HiltBindsAnnotationFragment()
    }

    private var _binding: HiltBindAnnotationFragmentBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var car: Car

    private lateinit var viewModelHilt: HiltBindsAnnotationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModelHilt = ViewModelProvider(this).get(HiltBindsAnnotationViewModel::class.java)
        _binding = HiltBindAnnotationFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            actionId.setOnClickListener {
                car.startCar()
            }
        }
    }

}