package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and
 * view the result on the screen.
 *
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button) // a reference to Button object
        rollButton.setOnClickListener {
            rollDice()
//            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
        }
    }

    /**
     * Roll the dice & update the screen with result
     */
    private fun rollDice() {
        // Create two new Dice objects w/ 6 sides then roll them
        val dice1 = Dice(6)
        val diceRoll1 = dice1.roll()

        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll()

        // Update screen with value from dice rolls
        val resultTextView1: TextView = findViewById(R.id.rollText1)
        resultTextView1.text = diceRoll1.toString()

        val resultTextView2: TextView = findViewById(R.id.rollText2)
        resultTextView2.text = diceRoll2.toString()

    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}