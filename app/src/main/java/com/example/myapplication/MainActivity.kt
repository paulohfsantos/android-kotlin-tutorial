package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.TextView
import android.content.Intent

class MainActivity: AppCompatActivity() {
    @SuppressLint("SetTextI18n")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // reference button
        // val btnClickMe = findViewById<Button>(R.id.click_me_btn)
        // val textChanged = findViewById<TextView>(R.id.textView)

        val showBtn = findViewById<Button>(R.id.show_btn)
        val upgradeBtn = findViewById<Button>(R.id.click_me_two)
        val shownTxt = findViewById<TextView>(R.id.text_shown)
        val inputVal = findViewById<EditText>(R.id.editText)
        val btn = findViewById<Button>(R.id.click_me_three)

        var count = 0

        btn.setOnClickListener {
            val intent = Intent(this, Page2::class.java)
            startActivity(intent)
            finish()
        }

        upgradeBtn.setOnClickListener {
            count++
            "Clicked $count times!".also { shownTxt.text = it }
        }

        showBtn.setOnClickListener {
            shownTxt.text = inputVal.text
            Toast.makeText(this@MainActivity, "text changed", Toast.LENGTH_LONG).show()
        }

//         set button an click eventListener
//        btnClickMe.setOnClickListener {
//            val str = textChanged.text.toString().contains("good morning")
//
//            if (str) {
//                textChanged.text = "hello, there!"
//                Toast.makeText(
//                    this@MainActivity,
//                    "text changed",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//        }
    }
}