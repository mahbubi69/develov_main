package com.example.develovmain.core.adater

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.develovmain.R
import com.example.develovmain.core.restApi.model.ProfileModel

class ProfileAdapter(
    private val context: Context,
    private val profile: List<ProfileModel>,
    val listener: (ProfileModel) -> Unit
) : RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {
    class ProfileViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgPosting = view.findViewById<ImageView>(R.id.img_item_post)
        val judulpostProfile = view.findViewById<TextView>(R.id.tv_item_judul)
        val descpostProfile = view.findViewById<TextView>(R.id.tv_item_deskripsi)


        fun bindView(profile: ProfileModel, listener: (ProfileModel) -> Unit) {
            judulpostProfile.text = profile.judulpostProfile
            descpostProfile.text = profile.descpostProfile
            imgPosting.setImageResource(profile.imgPosting)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        return ProfileViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_postingan, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.bindView(profile[position], listener)
    }

    override fun getItemCount(): Int = profile.size
}