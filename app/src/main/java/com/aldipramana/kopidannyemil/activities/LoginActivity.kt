package com.aldipramana.kopidannyemil.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aldipramana.kopidannyemil.R
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<MaterialButton>(R.id.btnLogin)
        val tvGoToRegister = findViewById<TextView>(R.id.tvGoToRegister)

        btnLogin.setOnClickListener {
            // TODO: Nanti kita tambahkan validasi input di sini
            // Untuk sekarang, langsung masuk ke MainActivity (Home)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Menutup halaman login agar tidak bisa di-back
        }

        tvGoToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}