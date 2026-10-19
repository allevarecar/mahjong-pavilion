package com.example.myapp

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val text = TextView(this)
        text.text = "It works!"
        text.textSize = 26f
        text.gravity = Gravity.CENTER
        setContentView(text)
    }
}
