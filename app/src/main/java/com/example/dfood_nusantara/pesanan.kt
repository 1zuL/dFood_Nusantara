package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class pesanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesanan)
        supportActionBar?.hide()

        val bayar = findViewById<TextView>(R.id.bayar)
        bayar.setOnClickListener {
            val intent = Intent(this, pembayaran::class.java)
            startActivity(intent)
        }
    }
}