package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class profil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val btnhome = findViewById<ImageView>(R.id.home)
        btnhome.setOnClickListener {
            val intent = Intent(this, dasboard::class.java)
            startActivity(intent)
        }
        val btnkeranjang = findViewById<ImageView>(R.id.keranjang)
        btnkeranjang.setOnClickListener {
            val intent = Intent(this, keranjang::class.java)
            startActivity(intent)
        }
        val btnriwayat = findViewById<ImageView>(R.id.riwayat)
        btnriwayat.setOnClickListener {
            val intent = Intent(this, riwayat::class.java)
            startActivity(intent)
        }
    }
}