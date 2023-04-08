package com.example.appdevtuts

data class Person(
    val firstName: String,
    val lastName: String,
    val birthDate: String,
    val country: String
) : java.io.Serializable