package com.demo.code.typesofdi.hilt.sampleone.concepts.methodInjection.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R

class HiltMethodInjectionFragment : Fragment() {

    companion object {
        fun newInstance() = HiltMethodInjectionFragment()
    }

    private lateinit var viewModel: HiltMethodInjectionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.hilt_method_injection_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HiltMethodInjectionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}