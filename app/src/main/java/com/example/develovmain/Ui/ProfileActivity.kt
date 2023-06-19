package com.example.develovmain.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.develovmain.R
import com.example.develovmain.core.adater.ProfileAdapter
import com.example.develovmain.core.restApi.model.ProfileModel

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val profileList = listOf<ProfileModel>(
            ProfileModel(
                R.drawable.mentor1,
                "yopiii49",
                "Share logo buatanku",
            ),
            ProfileModel(
                R.drawable.mentor1,
                "sariii887",
                "Izin bertanya",
            ),
            ProfileModel(
                R.drawable.mentor1,
                "Putri Maharani",
                "share desain",

            ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_profile)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ProfileAdapter(this, profileList){

        }
    }
}