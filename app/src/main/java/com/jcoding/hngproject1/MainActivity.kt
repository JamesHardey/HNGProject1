package com.jcoding.hngproject1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userInput = findViewById<TextInputEditText>(R.id.userInput)
        val displayBtn = findViewById<Button>(R.id.displayBtn)
        val text = findViewById<TextView>(R.id.textView)

        displayBtn.setOnClickListener {
            if(userInput.text?.isEmpty() == true){
                text.text = ""
                userInput.error = "Field must not be empty"
            }
            else{
                text.text = userInput.text.toString()
            }

        }
    }
}