package com.demo.code.ui.dagger.automobile.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.databinding.AutomobileFragmentBinding
import com.demo.code.ui.dagger.automobile.di.components.CarComponent
import com.demo.code.ui.dagger.automobile.di.components.DaggerCarComponent
import com.demo.code.ui.dagger.automobile.vm.AutomobileViewModel

class AutomobileFragment : Fragment() {

    private lateinit var _binding: AutomobileFragmentBinding
    private val binding get() = _binding

    private lateinit var viewModel: AutomobileViewModel

    private lateinit var carComponent: CarComponent

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

        DaggerCarComponent.builder().build().getCar().drive()

    }

}