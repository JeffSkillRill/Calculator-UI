package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var one: Button
    private lateinit var two: Button
    private lateinit var three: Button
    private lateinit var four: Button
    private lateinit var five: Button
    private lateinit var six: Button
    private lateinit var seven: Button
    private lateinit var eight: Button
    private lateinit var nine: Button
    private lateinit var zero: Button

    private lateinit var point: Button
    private lateinit var clear: Button

    private lateinit var div: Button
    private lateinit var multiply: Button
    private lateinit var plus: Button
    private lateinit var minus: Button


    private lateinit var operand: TextView
    private lateinit var result: TextView

    private var isPoint = true
    private var isSimvol = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





            one = findViewById(R.id.one)
            two = findViewById(R.id.two)
            three = findViewById(R.id.three)
            four = findViewById(R.id.four)
            five = findViewById(R.id.five)
            six = findViewById(R.id.six)
            seven = findViewById(R.id.seven)
            eight = findViewById(R.id.eight)
            nine = findViewById(R.id.nine)
            zero = findViewById(R.id.zero)

            point = findViewById(R.id.point)
            clear = findViewById(R.id.clear)
            div = findViewById(R.id.div)
            multiply = findViewById(R.id.multiply)
            plus = findViewById(R.id.plus)
            minus = findViewById(R.id.minus)


            operand = findViewById(R.id.textView)
            result = findViewById(R.id.textViewup)

        one.setOnClickListener(this)
        two.setOnClickListener(this)
        three.setOnClickListener(this)
        four.setOnClickListener(this)
        five.setOnClickListener(this)
        six.setOnClickListener(this)
        seven.setOnClickListener(this)
        eight.setOnClickListener(this)
        nine.setOnClickListener(this)
        zero.setOnClickListener(this)


        clear.setOnClickListener {
            operand.text = "0"
            isPoint = true
            isSimvol = true
        }
        point.setOnClickListener {
            if (isPoint) {
//                isDigit()
                operand.text = operand.text.toString() + "."
                isPoint = false
            }
        }

        div.setOnClickListener {
            addSymbol("/")
        }
        plus.setOnClickListener {
            addSymbol("+")
        }
        minus.setOnClickListener {
            addSymbol("-")
        }
        multiply.setOnClickListener {
            addSymbol("*")
        }



    }

    @SuppressLint("SetTextI18n")
    private fun addSymbol(symbol: String) {
        if (isSimvol)
        {
            operand.text = operand.text.toString()+symbol
            isSimvol=false
        }
        else{
            operand.text=operand.text.dropLast(1).toString()+symbol
        }

    }

    @SuppressLint("SetTextI18n")
    override fun onClick(view: View?) {
        val buttons = findViewById<Button>(view!!.id)
        if (operand.text == "0")
        {
            operand.text = " "
        }
        operand.text = operand.text.toString()+buttons.text
        isSimvol = true

    }
}