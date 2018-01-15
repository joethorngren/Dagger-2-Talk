package com.lighthouselabs.dagger2talk.dagger

import android.app.Activity
import com.lighthouselabs.dagger2talk.MainActivity
import com.lighthouselabs.dagger2talk.dagger.subcomponents.MainActivitySubcomponent
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap


@Module(subcomponents = [MainActivitySubcomponent::class])
abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(builder: MainActivitySubcomponent.Builder): AndroidInjector.Factory<out Activity>

}

