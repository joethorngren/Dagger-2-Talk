package com.lighthouselabs.dagger2talk

import android.content.Intent
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.afollestad.materialdialogs.MaterialDialog
import com.lighthouselabs.dagger2talk.dagger.models.MyObject
import com.lighthouselabs.dagger2talk.dagger.scopes.MyString
import com.lighthouselabs.dagger2talk.dagger.scopes.YourString
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var fooString: String
    @Inject lateinit var myObject: MyObject
    @Inject @MyString lateinit var  myString: String
    @Inject @YourString lateinit var  yourString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fooTextView = findViewById<TextView>(R.id.foo_string_textview)
        fooTextView.text = fooString

        Toast.makeText(this,
                "My Object: [Name = ${myObject.firstName}], ${myObject.lastName}], [Age = ${myObject.age}]",
                Toast.LENGTH_LONG)
                .show()

        val goToSecondActivityButton = findViewById<Button>(R.id.go_to_second_activity_button)
        goToSecondActivityButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))
            finish()
        }

    }
}
