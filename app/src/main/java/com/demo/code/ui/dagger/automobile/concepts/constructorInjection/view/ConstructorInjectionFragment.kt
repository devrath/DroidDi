package com.demo.code.ui.dagger.automobile.concepts.constructorInjection.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R

class ConstructorInjectionFragment : Fragment() {

    companion object {
        fun newInstance() = ConstructorInjectionFragment()
    }

    private lateinit var viewModel: ConstructorInjectionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.constructor_injection_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ConstructorInjectionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}