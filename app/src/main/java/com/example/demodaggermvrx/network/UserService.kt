package com.example.demodaggermvrx.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserService {
    companion object Factory {
        fun create():GetUserApi{
            val retrofit= Retrofit.Builder()
                .baseUrl("https://fc73-113-183-64-162.ngrok.io")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create<GetUserApi>(GetUserApi::class.java)
        }
    }
}