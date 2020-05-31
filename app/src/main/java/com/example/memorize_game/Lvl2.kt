package com.example.memorize_game

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.memorize_game.R.drawable.*
import kotlinx.android.synthetic.main.activity_lvl2.*
import kotlinx.android.synthetic.main.content_lvl2.*

class Lvl2 : AppCompatActivity() {


            @SuppressLint("SetTextI18n")
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_lvl2)
                setSupportActionBar(toolbar)

                val images: MutableList<Int> =
                    mutableListOf( r1, r2, r3, r4, r5, r6,r1, r2, r3, r4, r5, r6)

                val buttons: Array<Button> = arrayOf(button, button2, button3, button4,
                    button5, button6, button7, button8, button9, button10, button11, button12
                )

                val cardBack: Int = back2
                var clicked = 0
                var turnOver = false
                var lastClicked =-1

                images.shuffle()
                for( i:Int in 0..11){


                    buttons[i].text = "cardBack"
                    buttons[i].textSize = 0.0F
                    buttons[i].setOnClickListener {
                        if (buttons[i].text == "cardBack" && !turnOver) {
                            buttons[i].setBackgroundResource(images[i])
                            buttons[i].setText(images[i])
                            if (clicked == 0){
                                lastClicked = i
                            }

                            clicked++
                        }else if (buttons[i].text !in "cardBack"){
                            buttons[i].setBackgroundResource(cardBack)
                            buttons[i].text ="cardBack"
                            clicked--
                        }

                        if( clicked == 2){
                            turnOver = true
                            if (buttons[i].text == buttons[lastClicked].text){
                                buttons[i].isClickable = false
                                buttons[lastClicked].isClickable = false
                                turnOver = false
                                clicked = 0
                            }
                        } else if (clicked == 0 ){
                            turnOver=false
                        }
                    }
                }

            }

        }


