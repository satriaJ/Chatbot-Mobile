package com.example.chatbotlast

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btntentangprodi.setOnClickListener {
            startActivity(Intent(this,tentangprodi::class.java))
        }

        btnjurusan.setOnClickListener {
            startActivity(Intent(this,Jurusan::class.java))
        }

        btnbantuan.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("http://192.168.31.239:5000/"))
            startActivity(intent)
        }


    }
}