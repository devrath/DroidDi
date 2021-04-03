package com.demo.code.ui.dagger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.demo.code.R

class DaggerSelectionFragment : Fragment() {

    private lateinit var daggerSelectionViewModel: DaggerSelectionViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        daggerSelectionViewModel =
                ViewModelProvider(this).get(DaggerSelectionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dagger_selection, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        daggerSelectionViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}