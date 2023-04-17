package com.example.dfood_nusantara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        // Delay selama 3 detik sebelum pindah ke dasboard
        Handler().postDelayed({
            startActivity(Intent(this@MainActivity, login::class.java))
            finish()
        }, 3000)
    }
}