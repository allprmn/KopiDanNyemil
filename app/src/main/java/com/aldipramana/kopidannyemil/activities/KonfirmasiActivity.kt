package com.aldipramana.kopidannyemil.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aldipramana.kopidannyemil.R
import com.google.android.material.button.MaterialButton

class KonfirmasiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konfirmasi)

        val btnOke = findViewById<MaterialButton>(R.id.btnOke)
        btnOke.setOnClickListener {
            // Kembali ke Home
            val intent = Intent(this, MainActivity::class.java)
            // Bersihkan tumpukan activity agar tidak bisa back ke halaman konfirmasi
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}