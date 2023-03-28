package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.btnShowData.setOnClickListener {
            viewModel.getData()
            viewModel.car.observe(this) {
                Toast.makeText(
                    this@MainActivity,
                    "name = ${it.name} number = ${it.number}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}
