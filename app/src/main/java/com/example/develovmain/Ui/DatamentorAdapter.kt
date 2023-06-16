package com.example.develovmain

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DatamentorAdapter(private val context: Context, private val datamentor: List<Datamentor>, val listener: (Datamentor) -> Unit)
    : RecyclerView.Adapter<DatamentorAdapter.DatamentorViewHolder>(){
    class DatamentorViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgDatamentor = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameDatamentor = view.findViewById<TextView>(R.id.tv_item_name)
        val descDatamentor = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(datamentor: Datamentor, listener: (Datamentor) -> Unit){
            imgDatamentor.setImageResource(datamentor.imgDatamentor)
            nameDatamentor.text = datamentor.nameDatamentor
            descDatamentor.text = datamentor.descDatamentor
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatamentorViewHolder {
        return DatamentorViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_daftarmentor, parent, false)
        )
    }

    override fun onBindViewHolder(holder: DatamentorViewHolder, position: Int) {
        holder.bindView(datamentor[position], listener)
    }

    override fun getItemCount(): Int = datamentor.size
    }


