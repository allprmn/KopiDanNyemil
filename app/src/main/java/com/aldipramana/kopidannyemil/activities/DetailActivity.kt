package com.aldipramana.kopidannyemil.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.aldipramana.kopidannyemil.R

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName = findViewById<TextView>(R.id.tvDetailName)
        val tvPrice = findViewById<TextView>(R.id.tvDetailPrice)
        val tvDesc = findViewById<TextView>(R.id.tvDetailDesc)
        val btnPesan = findViewById<Button>(R.id.btnPesanSekarang)
        val imgDetail = findViewById<android.widget.ImageView>(R.id.imgDetail)


        // Ambil data dari Home
        val name = intent.getStringExtra("NAMA_MENU")
        val price = intent.getStringExtra("HARGA_MENU")
        val desc = intent.getStringExtra("DESC_MENU")
        val imageResId = intent.getIntExtra("GAMBAR_MENU", R.drawable.ic_launcher_background)
        imgDetail.setImageResource(imageResId)

        tvName.text = name
        tvPrice.text = price
        tvDesc.text = desc

        btnPesan.setOnClickListener {
            // Lempar ke halaman Checkout (form alamat)
            startActivity(Intent(this, CheckoutActivity::class.java))
        }
    }
}