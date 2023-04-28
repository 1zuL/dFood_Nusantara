package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class dasboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dasboard)
        supportActionBar?.hide()

        val btnmakanan = findViewById<ImageView>(R.id.makanan)
        btnmakanan.setOnClickListener {
            val intent = Intent(this, makanan::class.java)
            startActivity(intent)
        }

        val btnminuman = findViewById<ImageView>(R.id.minuman)
        btnminuman.setOnClickListener {
            val intent = Intent(this, minuman::class.java)
            startActivity(intent)
        }
        val btnchat = findViewById<ImageView>(R.id.chat)
        btnchat.setOnClickListener {
            val intent = Intent(this, chat::class.java)
            startActivity(intent)
        }
        val btnsrc = findViewById<ImageView>(R.id.searchView)
        btnsrc.setOnClickListener {
            val intent = Intent(this, pencarian::class.java)
            startActivity(intent)
        }
    }
}