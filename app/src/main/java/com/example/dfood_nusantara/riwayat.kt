package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class riwayat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_riwayat)
        supportActionBar?.hide()

        val btnctg = findViewById<View>(R.id.menu)
        btnctg.setOnClickListener {
            val intent = Intent(this, detail_riwayat::class.java)
            startActivity(intent)
        }
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
        val btnprofil = findViewById<ImageView>(R.id.profil)
        btnprofil.setOnClickListener {
            val intent = Intent(this, profil::class.java)
            startActivity(intent)
        }
    }
}