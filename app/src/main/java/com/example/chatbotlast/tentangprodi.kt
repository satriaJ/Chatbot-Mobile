package com.example.chatbotlast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class tentangprodi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentangprodi)
        val actionbar = supportActionBar
        actionbar!!.title = "Tentang Prodi"
        actionbar.setDisplayHomeAsUpEnabled(true)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}