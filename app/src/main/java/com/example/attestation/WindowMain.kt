package com.example.attestation

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private const val HELLO_KEY = "Hello_Key" // передали первого активити во второе активите

class WindowMain : AppCompatActivity() {

    private lateinit var nextActivityButton: Button // иницилизируем кнопку
    lateinit var MainWindowView: TextView// делаем раннюю иницилизацию поля , ишим по id

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_window_main)

        MainWindowView = findViewById(R.id.WindowMain)
        val helloValue: String? = intent.extras?.getString(HELLO_KEY)
        MainWindowView.text = helloValue


        nextActivityButton = findViewById(R.id.club_forum_button) // ищим кнопку по id
        //actionBar?.title = "abs"// меняем техт шапки активности
        nextActivityButton.setOnClickListener {  // вешаем на кнопку клик

            val clubForumIntend = Intent(this, ClubForum::class.java) // создаём интент
           clubForumIntend.putExtra(HELLO_KEY, "")// передаём в ключь с первой активите техт во второе активити
            startActivity(clubForumIntend) // запускаем интент
        }

        nextActivityButton = findViewById(R.id.newsButton) // ищим кнопку по id
        nextActivityButton.setOnClickListener {
            val link = Uri.parse("https://auto.honda.ru/news/")
            val openBrowserIntent = Intent(Intent.ACTION_VIEW, link)
            val chooser = Intent.createChooser(openBrowserIntent, "Browser")
            /// val chooserView = Intent(Intent.ACTION_VIEW,textView)
            startActivity(chooser)
        }
        nextActivityButton = findViewById(R.id.buy_car_button) // ищим кнопку по id
        nextActivityButton.setOnClickListener {
            val link = Uri.parse("https://auto.drom.ru/honda/used/")
            val openBrowserIntent = Intent(Intent.ACTION_VIEW, link)
            val chooser = Intent.createChooser(openBrowserIntent, "Browser")
            /// val chooserView = Intent(Intent.ACTION_VIEW,textView)
            startActivity(chooser)

        }
        nextActivityButton = findViewById(R.id.sell_car_button) // ищим кнопку по id
        nextActivityButton.setOnClickListener {
            val link = Uri.parse("https://auto.drom.ru/addbull/")
            val openBrowserIntent = Intent(Intent.ACTION_VIEW, link)
            val chooser = Intent.createChooser(openBrowserIntent, "Browser")
            /// val chooserView = Intent(Intent.ACTION_VIEW,textView)
            startActivity(chooser)

        }

    }
}