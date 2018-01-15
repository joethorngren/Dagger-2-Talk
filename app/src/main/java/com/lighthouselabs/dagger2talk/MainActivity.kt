package com.lighthouselabs.dagger2talk

import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.afollestad.materialdialogs.MaterialDialog
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var fooString: String
    @Inject lateinit var fooBarPair: Pair<String, String>
    @Inject lateinit var dialogBuilder: MaterialDialog.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val constraintLayout = findViewById<ConstraintLayout>(R.id.main_activity_container)

        Toast.makeText(this, fooString, Toast.LENGTH_SHORT).show()

        Snackbar.make(constraintLayout, fooBarPair.first + fooBarPair.second, Snackbar.LENGTH_LONG).show()

        dialogBuilder.positiveText("Hi there!").build().show()
    }
}
