package com.example.dogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dogs.model.DogBreed

class ListViewModel: ViewModel() {

    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        val dog1 = DogBreed("1", "Corgy", "15 years", "breedGroup", "bredFor", "temparament", "")
        val dog2 = DogBreed("2", "Lab", "10 years", "breedGroup", "bredFor", "temparament", "")
        val dog3 = DogBreed("3", "Husky", "20 years", "breedGroup", "bredFor", "temparament", "")
        val dogList = arrayListOf(dog1, dog2, dog3)

        dogs.value = dogList
        dogsLoadError.value = false
        loading.value = false
    }
}