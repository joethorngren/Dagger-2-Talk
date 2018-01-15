package com.lighthouselabs.dagger2talk

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var fooString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, fooString, Toast.LENGTH_SHORT).show()
    }
}
