package com.example.appdevtuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            var a = etFirstNum.text.toString().toFloat()
            var b = etSecondNum.text.toString().toFloat()
            tvResult.text = (a+b).toString()
        }
        btnSubtract.setOnClickListener {
            var a = etFirstNum.text.toString().toFloat()
            var b = etSecondNum.text.toString().toFloat()
            tvResult.text = (a-b).toString()
        }
        btnMultiply.setOnClickListener {
            var a = etFirstNum.text.toString().toFloat()
            var b = etSecondNum.text.toString().toFloat()
            tvResult.text = (a*b).toString()
        }
        btnDivide.setOnClickListener {
            var a = etFirstNum.text.toString().toFloat()
            var b = etSecondNum.text.toString().toFloat()
            tvResult.text = (a/b).toString()
        }
    }
}