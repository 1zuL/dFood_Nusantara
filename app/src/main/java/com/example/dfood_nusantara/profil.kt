package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class profil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        supportActionBar?.hide()

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
        val info1 = findViewById<View>(R.id.info)
        info1.setOnClickListener {
            val intent = Intent(this, informasi_pribadi::class.java)
            startActivity(intent)
        }
        val pengaturan1 = findViewById<View>(R.id.pengaturan)
        pengaturan1.setOnClickListener {
            val intent = Intent(this, pengaturan::class.java)
            startActivity(intent)
        }
        val bantuan1 = findViewById<View>(R.id.bantuan)
        bantuan1.setOnClickListener {
            val intent = Intent(this, bantuan::class.java)
            startActivity(intent)
        }
        val tentang1 = findViewById<View>(R.id.tentang)
        tentang1.setOnClickListener {
            val intent = Intent(this, tentang::class.java)
            startActivity(intent)
        }
        val keluar1 = findViewById<TextView>(R.id.btnkeluar)
        keluar1.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}