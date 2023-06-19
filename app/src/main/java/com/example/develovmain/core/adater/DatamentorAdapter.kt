package com.example.develovmain.core.adater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.develovmain.R
import com.example.develovmain.core.restApi.model.DatamentorModel

class DatamentorAdapter(
    private val context: Context,
    private val datamentor: List<DatamentorModel>,
    val listener: (DatamentorModel) -> Unit
) : RecyclerView.Adapter<DatamentorAdapter.DatamentorModelViewHolder>() {
    class DatamentorModelViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgDatamentor = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameDatamentor = view.findViewById<TextView>(R.id.tv_item_name)
        val descDatamentor = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(datamentor: DatamentorModel, listener: (DatamentorModel) -> Unit) {
            imgDatamentor.setImageResource(datamentor.imgDatamentor)
            nameDatamentor.text = datamentor.nameDatamentor
            descDatamentor.text = datamentor.descDatamentor
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatamentorModelViewHolder {
        return DatamentorModelViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_daftarmentor, parent, false)
        )
    }

    override fun onBindViewHolder(holder: DatamentorModelViewHolder, position: Int) {
        holder.bindView(datamentor[position], listener)
    }

    override fun getItemCount(): Int = datamentor.size
}


