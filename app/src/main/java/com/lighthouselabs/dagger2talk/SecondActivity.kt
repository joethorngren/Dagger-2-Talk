package com.lighthouselabs.dagger2talk

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val goToMainActivityButton = findViewById<Button>(R.id.go_to_main_activity_button)
        goToMainActivityButton.setOnClickListener { _ ->
            startActivity(Intent(this@SecondActivity, MainActivity::class.java)) }
    }
}