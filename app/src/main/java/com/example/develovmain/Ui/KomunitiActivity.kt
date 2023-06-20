package com.example.develovmain.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.develovmain.R
import com.example.develovmain.core.adater.KomunitiAdapter
import com.example.develovmain.core.restApi.model.KomunitiModel

class KomunitiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_komuniti)

        val komunitiList = listOf<KomunitiModel>(
            KomunitiModel(
                R.drawable.profil,
                "yopiii49",
                "Share logo buatanku",
                "izin share gess, projek logoku yang bertujuan untuk omkm ibukku",
                R.drawable.mentor1
            ),
            KomunitiModel(
                R.drawable.mentor3,
                "sariii887",
                "Izin bertanya",
                "perbedaan Ui dan Ux itu apa ya? mohon para master untuk memberi masukan",
                R.drawable.mentor2
            ),
            KomunitiModel(
                R.drawable.mentor2,
                "Putri Maharani",
                "share desain",
                "izin share gess, projek logoku yang bertujuan untuk omkm ibukku",
                R.drawable.mentor1

            ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_komuniti)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KomunitiAdapter(this, komunitiList){

        }
    }
}