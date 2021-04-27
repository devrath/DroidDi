package com.demo.code.typesofdi.hilt.sampleone.concepts.fieldInjection.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R

class HiltFieldInjectionFragment : Fragment() {

    companion object {
        fun newInstance() = HiltFieldInjectionFragment()
    }

    private lateinit var viewModel: HiltFieldInjectionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.hilt_field_injection_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HiltFieldInjectionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}