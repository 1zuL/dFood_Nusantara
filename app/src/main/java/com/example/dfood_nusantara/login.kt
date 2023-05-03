package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val myTextView = findViewById<TextView>(R.id.lppw)
        myTextView.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }
        val login = findViewById<TextView>(R.id.buttonlogin)
        login.setOnClickListener {
            val intent = Intent(this, dasboard::class.java)
            startActivity(intent)
        }
        val lp = findViewById<TextView>(R.id.lp)
        lp.setOnClickListener {
            val intent = Intent(this, lupapassword::class.java)
            startActivity(intent)
        }
    }
}