package com.example.demodaggermvrx.di

import com.example.demodaggermvrx.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun provideMainActivity():MainActivity

}