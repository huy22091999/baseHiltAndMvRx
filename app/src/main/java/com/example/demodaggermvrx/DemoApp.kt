package com.example.demodaggermvrx

import android.app.Application
import com.example.demodaggermvrx.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class DemoApp: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>
    =DaggerAppComponent.builder()
        .providerApp(this).build()

}