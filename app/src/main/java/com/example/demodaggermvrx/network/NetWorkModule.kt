package com.example.demodaggermvrx.network

import com.example.demodaggermvrx.ext.user.UserViewModel
import dagger.Module
import dagger.Provides

@Module
class NetWorkModule {
    @Provides
    fun providerUserService()=UserService.create()
    @Provides
    fun providerviewModel(api:GetUserApi)= UserViewModel(api)
}
