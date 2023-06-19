package com.example.develovmain.Ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.develovmain.R
import com.example.develovmain.core.adater.DatamentorAdapter
import com.example.develovmain.core.restApi.model.DatamentorModel

class DaftarMentor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_mentor)

        initiateDataRv()
    }

    private fun initiateDataRv() {
        val datamentorList = listOf<DatamentorModel>(
            DatamentorModel(
                R.drawable.mentor1, "Ningsih Cans", "08.00 - 12.00 WIB"
            ), DatamentorModel(
                R.drawable.mentor2, "Lalisa", "08.00 - 12.00 WIB"
            ), DatamentorModel(
                R.drawable.mentor3, "Putri Maharani", "08.00 - 12.00 WIB"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_daftarmentor)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = DatamentorAdapter(this, datamentorList) {}
    }

}