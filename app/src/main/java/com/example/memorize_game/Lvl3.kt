package com.example.memorize_game


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.widget.Button
import com.example.memorize_game.R.drawable.*
//importing the pictures so its easier to call them
import kotlinx.android.synthetic.main.activity_lvl3.*
import kotlinx.android.synthetic.main.content_lvl3.*

class Lvl3 : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lvl3)
        setSupportActionBar(toolbar)



        val images: MutableList<Int> =
            mutableListOf( l1, l2, l3 , l4, r5, r6, r7, r8,
                l1, l2, l3 , l4 , r5, r6, r7, r8)
// all photos listed that we want to use in this game so
// so we make the double so they match
        val buttons: Array<Button> = arrayOf( button, button2, button3, button4,
            button5, button6, button7, button8, button9, button10,
            button11, button12,button13, button14, button15, button16 )
//here is the arrray of buttos that the pictures are gonna display in
        val cardBack: Int = back2
        var clicked = 0
        var turnOver = false
        var lastClicked =-1

        images.shuffle()
        for( i:Int in 0..15){
// this shuffles the cards so each game has a new distribution

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
 //  these statements make sure that the amount of cards flipped do not
   //  exceed 2 and that the player must click to flip them back if they
   //  were wrong and if the answer was right it would keep them facing the user

                }

            }

        }
    }

}







