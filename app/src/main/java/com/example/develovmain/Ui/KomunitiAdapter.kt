package com.example.develovmain.Ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.develovmain.R

class KomunitiAdapter(
    private val context: Context,
    private val komuniti: List<Komuniti>,
    val listener: (Komuniti) -> Unit
) : RecyclerView.Adapter<KomunitiAdapter.KomunitiViewHolder>() {
    class KomunitiViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgprofilKomuniti = view.findViewById<ImageView>(R.id.img_item_profil)
        val nameprofilKomuniti = view.findViewById<TextView>(R.id.tv_item_profil)
        val judulpostKomuniti = view.findViewById<TextView>(R.id.tv_item_judul)
        val descpostKomuniti = view.findViewById<TextView>(R.id.tv_item_deskripsi)
        val imgpostKomuniti = view.findViewById<ImageView>(R.id.img_item_post)

        fun bindView(komuniti: Komuniti, listener: (Komuniti) -> Unit) {
            imgprofilKomuniti.setImageResource(komuniti.imgprofilKomuniti)
            nameprofilKomuniti.text = komuniti.nameprofilKomuniti
            judulpostKomuniti.text = komuniti.judulpostKomuniti
            descpostKomuniti.text = komuniti.descpostKomuniti
            imgpostKomuniti.setImageResource(komuniti.imgPosting)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KomunitiViewHolder {
        return KomunitiViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_komuniti, parent, false)
        )
    }

    override fun onBindViewHolder(holder: KomunitiViewHolder, position: Int) {
        holder.bindView(komuniti[position], listener)
    }

    override fun getItemCount(): Int = komuniti.size
}