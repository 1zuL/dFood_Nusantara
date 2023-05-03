package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detail_makanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_makanan)
        supportActionBar?.hide()


        val btntambah1 = findViewById<TextView>(R.id.btntambah)
        btntambah1.setOnClickListener {
            val intent = Intent(this, keranjang::class.java)
            startActivity(intent)
        }
    }
}