package com.istudio.di.modules.hilt.demos.clientserver.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.istudio.di.databinding.ActivityHiltNetworkApiBinding
import com.istudio.di.modules.hilt.demos.clientserver.data.model.User
import com.istudio.di.modules.hilt.demos.clientserver.utils.Status
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HiltNetworkApiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltNetworkApiBinding
    private lateinit var adapter: MainAdapter

    private val viewModel: HiltNetworkApiVm by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltNetworkApiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()
        setupObserver()
    }

    private fun setupUI() {
        adapter = MainAdapter(arrayListOf())

        binding.peopleListViewId.layoutManager = LinearLayoutManager(this)
        binding.peopleListViewId.addItemDecoration(
            DividerItemDecoration(
                binding.peopleListViewId.context,
                (binding.peopleListViewId.layoutManager as LinearLayoutManager).orientation
            )
        )
        binding.peopleListViewId.adapter = adapter
    }

    private fun setupObserver() {
        viewModel.users.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {

                    it.data?.let { users -> renderList(users) }
                    binding.apply {
                        progressBar.visibility = View.GONE
                        peopleListViewId.visibility = View.VISIBLE
                    }
                }
                Status.LOADING -> {
                    binding.apply {
                        progressBar.visibility = View.VISIBLE
                        peopleListViewId.visibility = View.GONE
                    }
                }
                Status.ERROR -> {
                    //Handle Error
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }
            }
        })
    }

    private fun renderList(users: List<User>) {
        adapter.addData(users)
        adapter.notifyDataSetChanged()
    }

}