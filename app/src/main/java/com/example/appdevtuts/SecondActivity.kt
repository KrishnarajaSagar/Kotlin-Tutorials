package com.example.appdevtuts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val firstName = intent.getStringExtra("EXTRA_FIRST_NAME")
        val lastName = intent.getStringExtra("EXTRA_LAST_NAME")
        val birthDate = intent.getStringExtra("EXTRA_BIRTH_DATE")
        val country = intent.getStringExtra("EXTRA_COUNTRY")
        val res = "${firstName} ${lastName} born on ${birthDate} at ${country}"
        tvResult.text = res
    }
}