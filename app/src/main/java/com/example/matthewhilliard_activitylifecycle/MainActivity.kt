package com.example.matthewhilliard_activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate has been called")

        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)

        button.setOnClickListener(){
            textView.text = "Hello"
            editText.setText("Hello")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart has been called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart has been called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume has been called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause has been called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop has been called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy has been called")
    }
}