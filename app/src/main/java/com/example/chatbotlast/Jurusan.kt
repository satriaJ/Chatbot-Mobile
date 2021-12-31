package com.example.chatbotlast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Jurusan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jurusan)
        val actionbar = supportActionBar
        actionbar!!.title = "Jurusan di Poltek"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}