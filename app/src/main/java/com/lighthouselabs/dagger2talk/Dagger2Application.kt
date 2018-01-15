package com.lighthouselabs.dagger2talk

import android.widget.Toast
import com.lighthouselabs.dagger2talk.dagger.ApplicationComponent
import com.lighthouselabs.dagger2talk.dagger.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Inject

class Dagger2Application : DaggerApplication() {

    @Inject lateinit var fooString: String

    private lateinit var applicationComponent : ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        Toast.makeText(this, fooString, Toast.LENGTH_SHORT).show()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        applicationComponent = DaggerApplicationComponent.create()
        applicationComponent.inject(this)
        return applicationComponent
    }

}