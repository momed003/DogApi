package com.learn.thedogapi.ui.screen

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.learn.thedogapi.ui.repository.DogApiService
import kotlinx.coroutines.launch

class DogViewModel : ViewModel(){
    private val apiService= DogApiService.create()

    private val _dogImage= mutableStateOf<String?>(null)
    val dogImage: State<String?> = _dogImage

    fun fetchRandomDog(){
        viewModelScope.launch {
            try {
                val response=apiService.getRandomDogs()
                _dogImage.value=response.message

            }catch (e:Exception){
                Log.d("ViewMode","${e.printStackTrace()}")
            }
        }
    }
}