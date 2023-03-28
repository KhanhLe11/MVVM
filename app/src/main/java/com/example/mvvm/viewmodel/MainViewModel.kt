package com.example.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm.model.Car
import com.example.mvvm.repository.MainRepository
import kotlinx.coroutines.launch

class MainViewModel : ViewModel(){
    val mainRepo: MainRepository = MainRepository()
    var car = MutableLiveData<Car>()

    fun getData(){
        viewModelScope.launch {
            car.value = mainRepo.getData()
        }
    }

}