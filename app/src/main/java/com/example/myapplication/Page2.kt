package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button

class Page2: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_page)

        val backBtn = findViewById<Button>(R.id.go_back)

//        backBtn.setOnClickListener {
//            onBackPressed() // this will go back to the home phone screen
//            finish()
//        }

        backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java) //go back to main page
            startActivity(intent)
            finish()
        }
    }
}