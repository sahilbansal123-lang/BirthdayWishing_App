package com.bansalsahil11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brithday_greeting_activty)

        val name = intent.getStringExtra(NAME_EXTRA)

        val myTextView = findViewById<TextView>(R.id.birthdayGreeting)
        myTextView.text = "Happy Birthday\n$name!"

    }
}