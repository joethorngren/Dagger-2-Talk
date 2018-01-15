package com.lighthouselabs.dagger2talk

import android.os.Bundle
import android.widget.Toast
import dagger.android.DaggerActivity
import javax.inject.Inject

class MainActivity : DaggerActivity() {

    @Inject lateinit var fooString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, fooString, Toast.LENGTH_SHORT).show()
    }
}
