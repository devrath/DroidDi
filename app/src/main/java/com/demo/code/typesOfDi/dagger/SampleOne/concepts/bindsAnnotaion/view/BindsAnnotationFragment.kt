package com.demo.code.typesOfDi.dagger.SampleOne.concepts.bindsAnnotaion.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R

class BindsAnnotationFragment : Fragment() {

    companion object {
        fun newInstance() = BindsAnnotationFragment()
    }

    private lateinit var viewModel: BindsAnnotationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.binds_annotation_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BindsAnnotationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}