package com.example.demodaggermvrx.network

import com.example.demodaggermvrx.model.User
import retrofit2.Call
import retrofit2.http.GET

interface GetUserApi {
    @GET("/")
     fun getUser():Call<List<User>>
}