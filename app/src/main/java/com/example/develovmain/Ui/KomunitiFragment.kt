package com.example.develovmain.Ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.develovmain.R
import com.example.develovmain.core.adater.KomunitiAdapter
import com.example.develovmain.core.restApi.model.KomunitiModel
import com.example.develovmain.databinding.FragmentKomunitiBinding
import com.example.develovmain.databinding.FragmentThirdScreenBinding

class KomunitiFragment : Fragment() {

    private var _binding: FragmentKomunitiBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentKomunitiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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
        val recyclerView = binding.rvKomuniti
        //recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        //recyclerView.adapter = KomunitiAdapter(this, komunitiList) {

        }

    }

