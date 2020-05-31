package com.example.memorize_game

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = findViewById<Button>(R.id.start)
        start.setOnClickListener{
            val intent = Intent(this,Level::class.java)
            startActivity(intent)
            // start page where the user clicks start to begin the
            // game by directing the user to the level page where he can choose the levels
    }

}}