package com.lighthouselabs.dagger2talk.dagger.subcomponents

import com.lighthouselabs.dagger2talk.MainActivity
import com.lighthouselabs.dagger2talk.dagger.modules.MainActivityModule
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [MainActivityModule::class])
interface MainActivitySubcomponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}