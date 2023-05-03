package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class informasi_pribadi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informasi_pribadi)
        supportActionBar?.hide()

        val simpan1 = findViewById<Button>(R.id.btnsimpan)
        simpan1.setOnClickListener {
            val intent = Intent(this, profil::class.java)
            startActivity(intent)
        }
    }
}