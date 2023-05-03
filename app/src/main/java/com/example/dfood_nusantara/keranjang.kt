package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class keranjang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keranjang)
        supportActionBar?.hide()


        val pesan1 = findViewById<TextView>(R.id.pesan)
        pesan1.setOnClickListener {
            val intent = Intent(this, pesanan::class.java)
            startActivity(intent)
        }
        val btnhome = findViewById<ImageView>(R.id.home)
        btnhome.setOnClickListener {
            val intent = Intent(this, dasboard::class.java)
            startActivity(intent)
        }
        val btnriwayat = findViewById<ImageView>(R.id.riwayat)
        btnriwayat.setOnClickListener {
            val intent = Intent(this, riwayat::class.java)
            startActivity(intent)
        }
        val btnprofil = findViewById<ImageView>(R.id.profil)
        btnprofil.setOnClickListener {
            val intent = Intent(this, profil::class.java)
            startActivity(intent)
        }
    }
}