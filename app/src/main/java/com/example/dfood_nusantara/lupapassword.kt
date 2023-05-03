package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class lupapassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lupapassword)
        supportActionBar?.hide()


        val btnmasuk = findViewById<TextView>(R.id.lppw)
        btnmasuk.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        val btnlgn = findViewById<TextView>(R.id.buttonlogin)
        btnlgn.setOnClickListener {
            val intent = Intent(this, lp2::class.java)
            startActivity(intent)
        }
    }
}