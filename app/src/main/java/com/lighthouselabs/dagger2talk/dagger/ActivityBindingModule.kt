package com.lighthouselabs.dagger2talk.dagger

import com.lighthouselabs.dagger2talk.MainActivity
import com.lighthouselabs.dagger2talk.dagger.modules.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun bindMainActivity(): MainActivity

}

