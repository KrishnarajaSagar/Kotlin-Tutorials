package com.example.appdevtuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnApply.setOnClickListener {
            val firstName = etFirstName.text.toString()
            val lastName = etLastName.text.toString()
            val birthDate = etBirthDate.text.toString()
            val country = etCountry.text.toString()
            Intent(this,SecondActivity::class.java).also {
                it.putExtra("EXTRA_FIRST_NAME", firstName)
                it.putExtra("EXTRA_LAST_NAME", lastName)
                it.putExtra("EXTRA_BIRTH_DATE", birthDate)
                it.putExtra("EXTRA_COUNTRY", country)
                startActivity(it)
            }
        }
    }
}