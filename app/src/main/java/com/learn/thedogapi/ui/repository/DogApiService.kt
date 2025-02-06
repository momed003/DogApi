package com.learn.thedogapi.ui.repository

import com.learn.thedogapi.ui.model.DogResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface DogApiService {
    @GET("breeds/image/random")
    suspend fun getRandomDogs(): DogResponse

    companion object {
        const val BASE_URL = "https://dog.ceo/dog-api/"

        fun create(): DogApiService {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(DogApiService::class.java)
        }
    }

}