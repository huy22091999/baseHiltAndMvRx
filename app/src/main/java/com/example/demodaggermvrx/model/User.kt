package com.example.demodaggermvrx.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String? = null,

    @SerializedName("phone")
    val phone: String? = null
)
