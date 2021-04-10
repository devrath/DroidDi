package com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R

class FieldInjectionFragment : Fragment() {

    companion object {
        fun newInstance() = FieldInjectionFragment()
    }

    private lateinit var viewModel: FieldInjectionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.field_injection_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FieldInjectionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}