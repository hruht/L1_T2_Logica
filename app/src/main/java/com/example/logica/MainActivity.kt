package com.example.logica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubmit.setOnClickListener{
            checkAnswers()
        }
    }
    /**
     * Get the answers from the fields, see if they're all correct, call the appropriate toast depending on the answer
     */
    private fun checkAnswers(){

        val a1 = et1.text.toString()
        val a2 = et2.text.toString()
        val a3 = et3.text.toString()
        val a4 = et4.text.toString()

        if ((a1 == "T") && (a2 == "F") && (a3 == "F") && (a4 == "F")) {
            onAnswerCorrect()
        } else {
            onAnswerIncorrect()
        }
    }

    /**
     * Displays a successful Toast message.
     */
    private fun onAnswerCorrect() {
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show()
    }

    /**
     * Displays a incorrect Toast message.
     */
    private fun onAnswerIncorrect() {
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_SHORT).show()
    }
}
