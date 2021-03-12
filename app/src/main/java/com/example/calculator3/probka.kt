package com.example.calculator3

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Probka : AppCompatActivity() {

    /** plus substract degree division */

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view)
    }

    fun calculate(view: View)
    {
        val num1: TextView = findViewById(R.id.n1) as TextView
        val num2: TextView = findViewById(R.id.n2) as TextView

        val sign = findViewById<TextView>(R.id.ourSign)

        val answer = findViewById<TextView>(R.id.answer)

        val dec1 : Float = num1.text.toString().toFloat()
        val dec2 : Float = num2.text.toString().toFloat()

        when(sign.text)
        {
            "+" -> answer.text = (dec1 + dec2).toString()
            "-" -> answer.text = (dec1 - dec2).toString()
            "*" -> answer.text = (dec1 * dec2).toString()
            "/" -> answer.text = (dec1 / dec2).toString()
        }
    }

    fun changeSign(view: View)
    {
        val sign = findViewById<TextView>(R.id.ourSign)
        when(view.id)
        {
            R.id.plus -> sign.text = "+"
            R.id.substract -> sign.text = "-"
            R.id.degree -> sign.text = "*"
            R.id.division -> sign.text = "/"
        }
    }
}
