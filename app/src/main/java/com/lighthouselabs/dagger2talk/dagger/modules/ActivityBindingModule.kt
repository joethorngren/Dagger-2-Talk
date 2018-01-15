package com.lighthouselabs.dagger2talk.dagger.modules

import com.lighthouselabs.dagger2talk.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivityInjector(): MainActivity
}