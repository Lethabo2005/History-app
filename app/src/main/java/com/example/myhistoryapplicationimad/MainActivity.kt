package com.example.myhistoryapplicationimad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    private lateinit var enterYourAgeTxt: EditText
    private lateinit var generateAgeBtn: Button
    private lateinit var clearBtn: Button
    private lateinit var resultTxt: TextView
    private lateinit var exitbtn: Button
    private lateinit var background: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generateAgeBtn = findViewById(R.id.generateAgeBtn)
        enterYourAgeTxt = findViewById(R.id.enterYourAgeTxt)
        clearBtn = findViewById(R.id.clearBtn)
        resultTxt = findViewById(R.id.resultTxt)
        exitbtn = findViewById(R.id.exitbtn)


        generateAgeBtn.setOnClickListener {
            handleEnterAgeClick()
        }

        clearBtn.setOnClickListener {
            enterYourAgeTxt.text.clear()
            resultTxt.text = ("")
        }
    }


    private fun handleEnterAgeClick() {
        val enterYourAgeTxt = enterYourAgeTxt.text.toString()
        if (enterYourAgeTxt.isEmpty()) {
            resultTxt.text = "Please enter your age"
            return
        }

        val age = enterYourAgeTxt.toIntOrNull()
        if (age == null) {
            resultTxt.text = "The age you have entered is invalid. Please enter a valid number"
            return
        }
        if (age < 20 || age > 100) {
            resultTxt.text = "The age entered doesnt fit in the range. Please enter any number from 20 to 100"
            return
        }
        when (age) {
            30 -> {
                resultTxt.text = "Paul Adam"

            }

            31 -> {
                resultTxt.text = "Zygmunt Janiszewski"

            }

            36 -> {
                resultTxt.text = "Benito Pérez Galdós"

            }

            41 -> {
                resultTxt.text = "John Francis Dodge"

            }

            42 -> {
                resultTxt.text = "Reginald De Koven"

            }

            50 -> {
                resultTxt.text = "Georg Lurich"

            }

            57 -> {
                resultTxt.text = "Amedeo Modigliani"

            }

            60 -> {
                resultTxt.text = "Alexander Vasilevich Kolchak"

            }

            64 -> {
                resultTxt.text = "Richard Dehmel"

            }

            70 -> {
                resultTxt.text = "Émile Sauret"

            }

            71 -> {
                resultTxt.text = "Jean Allemane"

            }

            72 -> {
                resultTxt.text = "Ottalee Baker"

            }

            79 -> {
                resultTxt.text = "Jacinta Marto"

            }

            100 -> {
                resultTxt.text = "Alexander Alexandrovich Il'yinsky"

            }

            else -> resultTxt.text = "No match found!"

        }
    }
}