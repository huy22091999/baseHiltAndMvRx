package com.example.demodaggermvrx.ext.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.demodaggermvrx.model.User
import com.example.demodaggermvrx.network.GetUserApi
import com.example.demodaggermvrx.network.UserService
import retrofit2.Call
import javax.inject.Inject

class UserViewModel @Inject constructor(
    private var getUserApi: GetUserApi
) {
    private var _user=MutableLiveData<Call<List<User>>>()
    val user:LiveData<Call<List<User>>> get() = _user
    fun getUser() {
        _user.value=getUserApi.getUser()
    }
}