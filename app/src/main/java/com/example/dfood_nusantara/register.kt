package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        val btnsrc = findViewById<TextView>(R.id.buttonregister)
        btnsrc.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

    }
}