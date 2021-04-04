package com.demo.code.ui.dagger.automobile.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.demo.code.databinding.AutomobileFragmentBinding
import com.demo.code.ui.dagger.automobile.di.components.DaggerCarComponent
import com.demo.code.ui.dagger.automobile.vehicleParts.Car
import com.demo.code.ui.dagger.automobile.vm.AutomobileViewModel
import javax.inject.Inject


class AutomobileFragment : Fragment() {

    private lateinit var _binding: AutomobileFragmentBinding
    private val binding get() = _binding

    private lateinit var viewModel: AutomobileViewModel

    // Field Injection - It is done here
    @Inject
    lateinit var car: Car

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(AutomobileViewModel::class.java)
        _binding = AutomobileFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Here using the generated Car component - we can access the interface method -- then get hold of drive method
        DaggerCarComponent.create().inject(this)
        car.drive()
    }

}