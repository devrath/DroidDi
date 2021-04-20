package com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R

class DynamicValueInjectionFragment : Fragment() {

    companion object {
        fun newInstance() = DynamicValueInjectionFragment()
    }

    private lateinit var viewModel: DynamicValueInjectionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dynamic_value_injection_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DynamicValueInjectionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}