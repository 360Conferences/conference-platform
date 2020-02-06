package com.conferenceplatform.androidapp

import androidx.appcompat.app.AppCompatActivity
import sample.hello
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title: TextView = findViewById(R.id.title)
        title.text = hello()
    }
}
