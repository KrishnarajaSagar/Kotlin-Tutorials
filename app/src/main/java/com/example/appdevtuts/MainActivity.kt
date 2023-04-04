package com.example.appdevtuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            var a = etFirstNum.text.toString().toFloat()
            var b = etSecondNum.text.toString().toFloat()
            tvResult.text = (a+b).toString()
            Toast.makeText(
                this,
                "${(a+b).toString()}",
                Toast.LENGTH_LONG)
                .show()
        }
        btnSubtract.setOnClickListener {
            var a = etFirstNum.text.toString().toFloat()
            var b = etSecondNum.text.toString().toFloat()
            tvResult.text = (a-b).toString()
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(
                    R.layout.custom_toast,
                    clToast
                )
                show()
            }
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