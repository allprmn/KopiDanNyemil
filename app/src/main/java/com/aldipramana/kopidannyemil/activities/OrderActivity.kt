package com.aldipramana.kopidannyemil.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aldipramana.kopidannyemil.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.button.MaterialButton

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationOrder)
        bottomNav.selectedItemId = R.id.nav_order

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.nav_order -> true
                R.id.nav_profile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                else -> false
            }
        }

        // Tombol untuk ke halaman Konfirmasi
        val btnOrder = findViewById<MaterialButton>(R.id.btnOrderKirim)
        btnOrder.setOnClickListener {
            startActivity(Intent(this, KonfirmasiActivity::class.java))
            finishAffinity() // Menutup semua activity sebelumnya
        }
    }
}