package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class konfirmasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi)
        supportActionBar?.hide()

        val konfrim = findViewById<TextView>(R.id.faktur)
        konfrim.setOnClickListener {
            val intent = Intent(this, faktur::class.java)
            startActivity(intent)
        }
    }
}