package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class makanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)
        supportActionBar?.hide()


        val btnmakanan21 = findViewById<View>(R.id.mkn)
        btnmakanan21.setOnClickListener {
            val intent = Intent(this, detail_makanan::class.java)
            startActivity(intent)
        }
    }
}