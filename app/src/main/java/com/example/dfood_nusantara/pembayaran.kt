package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class pembayaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembayaran)
        supportActionBar?.hide()

        val konfrim = findViewById<TextView>(R.id.konfirmasi)
        konfrim.setOnClickListener {
            val intent = Intent(this, konfirmasi::class.java)
            startActivity(intent)
        }
    }
}