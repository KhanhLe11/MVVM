package com.example.mvvm.repository

import com.example.mvvm.model.Car
import kotlinx.coroutines.delay

class MainRepository {

    suspend fun getData():Car{
        delay(4000)
        return Car("Toyota","92H7 2311")
    }
}