package com.aldipramana.kopidannyemil.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aldipramana.kopidannyemil.R
import com.google.android.material.button.MaterialButton

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnRegister = findViewById<MaterialButton>(R.id.btnRegister)
        val tvGoToLogin = findViewById<TextView>(R.id.tvGoToLogin)

        btnRegister.setOnClickListener {
            // TODO: Nanti kita tambahkan validasi input dan passing data nama
            // Untuk sekarang, langsung masuk ke MainActivity (Home)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finishAffinity() // Menutup semua activity sebelumnya (Login & Register)
        }

        tvGoToLogin.setOnClickListener {
            // Kembali ke halaman Login
            finish()
        }
    }
}