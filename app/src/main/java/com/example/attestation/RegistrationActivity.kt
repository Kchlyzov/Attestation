package com.example.attestation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private const val HELLO_KEY = "Hello_Key" // передали первого активити во второе активите

class RegistrationActivity : AppCompatActivity() {

    private lateinit var nextActivityButton: Button // иницилизируем кнопку
    lateinit var RegistrationView: TextView// делаем раннюю иницилизацию поля , ишим по id


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        RegistrationView = findViewById(R.id.club_forum_button)

        val helloValue: String? = intent.extras?.getString(HELLO_KEY)
        RegistrationView.text = helloValue
    }
}