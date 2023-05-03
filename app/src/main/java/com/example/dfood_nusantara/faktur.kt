package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class faktur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faktur)
        supportActionBar?.hide()

        val konfrim1 = findViewById<TextView>(R.id.sudah)
        konfrim1.setOnClickListener {
            val intent = Intent(this, dasboard::class.java)
            startActivity(intent)
        }
    }
}