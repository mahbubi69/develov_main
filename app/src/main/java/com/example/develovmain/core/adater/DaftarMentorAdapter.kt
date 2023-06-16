package com.example.develovmain.core.adater

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.develovmain.DatamentorMentor
import com.example.develovmain.R

class DaftarMentorAdapter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_mentor)

        initiateDataRv()
    }

    private fun initiateDataRv() {
        val datamentorList = listOf<DatamentorMentor>(
            DatamentorMentor(
                R.drawable.mentor1, "Ningsih Cans", "08.00 - 12.00 WIB"
            ), DatamentorMentor(
                R.drawable.mentor2, "Lalisa", "08.00 - 12.00 WIB"
            ), DatamentorMentor(
                R.drawable.mentor3, "Putri Maharani", "08.00 - 12.00 WIB"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_daftarmentor)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = DatamentorAdapter(this, datamentorList) {}
    }

}