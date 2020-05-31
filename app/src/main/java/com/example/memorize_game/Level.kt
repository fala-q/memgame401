package com.example.memorize_game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Level : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level)

// the page where it directs to the specific chosen level in this case one from the 3

                 val intentLvl1 = findViewById<Button>(R.id.lvl1btn)
             intentLvl1.setOnClickListener {
                val intentLvl1 = Intent(this, Lvl1::class.java)
            startActivity(intentLvl1)
             }
                val intentLvl2 =  findViewById<Button>(R.id.lvl2btn)
            intentLvl2.setOnClickListener{
                val intentLvl2 = Intent ( this, Lvl2 :: class.java)
                startActivity(intentLvl2)
            }
                val intentLvl3 = findViewById<Button>(R.id.lvl3btn)
            intentLvl3.setOnClickListener {
                val intentLvl3 = Intent(this, Lvl3::class.java)
                startActivity(intentLvl3)
            }






                }
            }


