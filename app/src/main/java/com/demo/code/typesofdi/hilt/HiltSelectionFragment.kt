package com.demo.code.typesofdi.hilt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.demo.code.R

class HiltSelectionFragment : Fragment() {

    private lateinit var hiltSelectionViewModel: HiltSelectionViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        hiltSelectionViewModel =
                ViewModelProvider(this).get(HiltSelectionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_hilt_selection, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        hiltSelectionViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}