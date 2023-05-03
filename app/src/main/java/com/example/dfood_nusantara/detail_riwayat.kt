package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class detail_riwayat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_riwayat)
        supportActionBar?.hide()


        val kembali = findViewById<Button>(R.id.sudah)
        kembali.setOnClickListener {
            val intent = Intent(this, riwayat::class.java)
            startActivity(intent)
        }
    }
}