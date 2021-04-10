package com.demo.code.ui.dagger.automobile.concepts.providesAnnotation.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R

class ProvidesAnnotationFragment : Fragment() {

    companion object {
        fun newInstance() = ProvidesAnnotationFragment()
    }

    private lateinit var viewModel: ProvidesAnnotationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.provides_annotation_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProvidesAnnotationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}