package com.lighthouselabs.dagger2talk

import android.app.Activity
import android.app.Application
import android.widget.Toast
import com.lighthouselabs.dagger2talk.dagger.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class Dagger2Application : Application(), HasActivityInjector {

    @Inject lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>
    @Inject lateinit var fooString: String

    override fun onCreate() {
        super.onCreate()

        DaggerApplicationComponent.create().inject(this)

        Toast.makeText(this, fooString, Toast.LENGTH_SHORT).show()
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingActivityInjector
    }

}