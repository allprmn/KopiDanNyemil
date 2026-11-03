package com.aldipramana.kopidannyemil.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aldipramana.kopidannyemil.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class OrderHistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_history)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        val sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)
        val username = sharedPreferences.getString("USERNAME", "User") ?: "User"

        val tvGreeting = findViewById<TextView>(R.id.tvGreetingOrder)
        tvGreeting.text = "Halo $username,"

        bottomNav.selectedItemId = R.id.nav_order

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Pindah ke Home
                    val intent = Intent(this, MainActivity::class.java)
                    // Flag ini agar tidak menumpuk activity di background
                    intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.nav_order -> {
                    // Sudah di halaman Order, tidak perlu melakukan apa-apa
                    true
                }
                R.id.nav_profile -> {
                    // Pindah ke Profile
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                    overridePendingTransition(0, 0)
                    true
                }
                else -> false
            }
        }
    }
}