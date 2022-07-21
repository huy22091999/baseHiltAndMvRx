package com.example.demodaggermvrx.di

import com.example.demodaggermvrx.DemoApp
import com.example.demodaggermvrx.MainActivity
import com.example.demodaggermvrx.network.NetWorkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    ActivityBindingModule::class,
    NetWorkModule::class

])
interface AppComponent :AndroidInjector<DemoApp>  {
    @Component.Builder
    interface Builder{
        @BindsInstance
        fun providerApp(app: DemoApp):Builder
        fun build():AppComponent
    }
}