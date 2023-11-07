package com.example.units_conv

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var cToF: Button
    private lateinit var fToC: Button
    private lateinit var result: TextView
    private lateinit var enterTemp: EditText
    private var result0: Double = 0.0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cToF = findViewById(R.id.cToF)
        fToC = findViewById(R.id.fToC)
        result = findViewById(R.id.result)
        enterTemp = findViewById(R.id.enterTemp)

        cToF.setOnClickListener {
            val temp = enterTemp.text.toString().toDouble()

            result0 = (temp * 1.8) + 32
            result.text = result0.toString()

        }

        fToC.setOnClickListener {
            val temp = enterTemp.text.toString().toDouble()
            result0 = (temp - 32) / 1.8
            result.text = result0.toString()
        }
    }
}