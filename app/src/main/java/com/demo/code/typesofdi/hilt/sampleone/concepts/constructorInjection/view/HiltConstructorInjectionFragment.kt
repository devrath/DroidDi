package com.demo.code.typesofdi.hilt.sampleone.concepts.constructorInjection.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R

class HiltConstructorInjectionFragment : Fragment() {

    companion object {
        fun newInstance() = HiltConstructorInjectionFragment()
    }

    private lateinit var viewModel: HiltConstructorInjectionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.hilt_constructor_injection_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HiltConstructorInjectionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}