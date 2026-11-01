package com.aldipramana.kopidannyemil.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aldipramana.kopidannyemil.R
import com.aldipramana.kopidannyemil.models.Menu

class MenuAdapter(private val listMenu: List<Menu>) : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menu = listMenu[position]
        holder.tvName.text = menu.name
        holder.tvDesc.text = menu.description
        holder.tvPrice.text = menu.price

        // Jika nanti Anda punya gambar asli di drawable, gunakan baris ini:
        // holder.imgMenu.setImageResource(menu.imageResId)
    }

    override fun getItemCount(): Int = listMenu.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgMenu: ImageView = itemView.findViewById(R.id.imgMenu)
        val tvName: TextView = itemView.findViewById(R.id.tvMenuName)
        val tvDesc: TextView = itemView.findViewById(R.id.tvMenuDesc)
        val tvPrice: TextView = itemView.findViewById(R.id.tvMenuPrice)
    }
}