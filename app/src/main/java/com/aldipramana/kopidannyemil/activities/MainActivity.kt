package com.aldipramana.kopidannyemil.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aldipramana.kopidannyemil.R
import com.aldipramana.kopidannyemil.adapters.MenuAdapter
import com.aldipramana.kopidannyemil.models.Menu


class MainActivity : AppCompatActivity() {

    private lateinit var rvMenu: RecyclerView
    private lateinit var menuAdapter: MenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMenu = findViewById(R.id.rvMenu)

        val listMenu = listOf(
            Menu("Kopi Susu Gula Aren", "Espresso, susu, gula aren", "Rp 22.000", R.drawable.ic_launcher_background),
            Menu("Donat Cokelat", "Donat empuk, glaze cokelat", "Rp 12.000", R.drawable.ic_launcher_background),
            Menu("Sourdough Loaf", "Roti fermentasi alami", "Rp 35.000", R.drawable.ic_launcher_background),
            Menu("Cappuccino", "Espresso, foam susu lembut", "Rp 25.000", R.drawable.ic_launcher_background),
            Menu("Matcha Latte", "Matcha Jepang, susu segar", "Rp 27.000", R.drawable.ic_launcher_background),
            Menu("Croissant Butter", "Pastry berlapis mentega", "Rp 20.000", R.drawable.ic_launcher_background)
        )

        rvMenu.layoutManager = LinearLayoutManager(this)
        menuAdapter = MenuAdapter(listMenu)
        rvMenu.adapter = menuAdapter
    }
}