package com.example.attestation

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
private const val HELLO_KEY = "Hello_Key"// создаем ключь и ложим и передаём данные

class MainActivity : AppCompatActivity() {

    private lateinit var nextActivityButton: Button // иницилизируем кнопку

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //

        nextActivityButton = findViewById(R.id.toComeInButton) // ищим кнопку по id
        //actionBar?.title = "abs"// меняем техт шапки активности
        nextActivityButton.setOnClickListener {  // вешаем на кнопку клик

            val windowMainIntend = Intent(this, WindowMain::class.java) // создаём интент
            windowMainIntend.putExtra(HELLO_KEY, "")// передаём в ключь с первой активите техт во второе активити
            startActivity(windowMainIntend) // запускаем интент
        }
        nextActivityButton = findViewById(R.id.registrationButton) // ищим кнопку по id
        //actionBar?.title = "abs"// меняем техт шапки активности
        nextActivityButton.setOnClickListener {  // вешаем на кнопку клик

            val registrationMainIntend = Intent(this, RegistrationActivity::class.java) // создаём интент
            registrationMainIntend.putExtra(HELLO_KEY, "")// передаём в ключь с первой активите техт во второе активити
            startActivity(registrationMainIntend) // запускаем интент
        }


    }
}