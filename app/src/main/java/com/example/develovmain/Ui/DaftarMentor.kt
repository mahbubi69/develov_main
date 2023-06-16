package com.example.develovmain

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DaftarMentor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_mentor)

        val datamentorList = listOf<Datamentor>(
            Datamentor(
                R.drawable.mentor1,
                "Ningsih Cans",
                "08.00 - 12.00 WIB"
            ),
            Datamentor(
                R.drawable.mentor2,
                "Lalisa",
                "08.00 - 12.00 WIB"
            ),
            Datamentor(
                R.drawable.mentor3,
                "Putri Maharani",
                "08.00 - 12.00 WIB"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_daftarmentor)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = DatamentorAdapter(this, datamentorList){

        }
    }
}