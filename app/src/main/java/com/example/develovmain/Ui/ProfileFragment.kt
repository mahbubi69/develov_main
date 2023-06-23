package com.example.develovmain.Ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.develovmain.R
import com.example.develovmain.core.adater.ProfileAdapter
import com.example.develovmain.core.restApi.model.ProfileModel
import com.example.develovmain.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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
        val recyclerView = binding.rvProfile
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ProfileAdapter(requireContext(), profileList) {

        }

    }
}