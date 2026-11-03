package com.aldipramana.kopidannyemil.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aldipramana.kopidannyemil.R
import com.aldipramana.kopidannyemil.adapters.MenuAdapter
import com.aldipramana.kopidannyemil.models.Menu
import android.content.Intent
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var rvMenu: RecyclerView
    private lateinit var menuAdapter: MenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)
        val sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)
        val username = sharedPreferences.getString("USERNAME", "User") ?: "User"
        tvGreeting.text = "Halo $username,"
        rvMenu = findViewById(R.id.rvMenu)


        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNav.selectedItemId = R.id.nav_home // Set menu Home sebagai default

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    if (this !is MainActivity) {
                        startActivity(Intent(this, MainActivity::class.java))
                        overridePendingTransition(0, 0)
                    }
                    true
                }
                R.id.nav_order -> {
                    if (this !is OrderHistoryActivity) {
                        startActivity(Intent(this, OrderHistoryActivity::class.java))
                        overridePendingTransition(0, 0)
                    }
                    true
                }
                R.id.nav_profile -> {
                    if (this !is ProfileActivity) {
                        startActivity(Intent(this, ProfileActivity::class.java))
                        overridePendingTransition(0, 0)
                    }
                    true
                }
                else -> false
            }
        }

        val listMenu = listOf(
            Menu("Kopi Karuhun", "Espresso, gula aren", "Rp 7.000", R.drawable.kopihitam),
            Menu("Kulub Sampeu", "Dibuat dengan sampe asli yang di tanam sendiri", "Rp 12.000", R.drawable.singkong),
            Menu("Kopi Susu", "Campuran antara expreso dan susu, dengan takaran yang pas", "Rp 15.000", R.drawable.kopisusu),
            Menu("Teh Susu", "Campuran antara teh dan susu", "Rp 10.000", R.drawable.tehsusu),
            Menu("Getuk Singkong", "Diproses dengan 1001 pukulan menghasilkan teksture yang kenyal", "Rp 20.000", R.drawable.getuk),
            Menu("Bala-bala Bonteng", "Gorengan yang cocok dinikmati saat cuaca panas ataupun dingin", "Rp 3.000", R.drawable.balabala)
        )

        rvMenu.layoutManager = LinearLayoutManager(this)
        menuAdapter = MenuAdapter(listMenu)
        rvMenu.adapter = menuAdapter
    }
}