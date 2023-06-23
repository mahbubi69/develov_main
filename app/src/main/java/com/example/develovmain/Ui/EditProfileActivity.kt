package com.example.develovmain.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.develovmain.R
import com.example.develovmain.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        initiateEditProfile()
        setContentView(binding.root)
    }


    private fun initiateEditProfile() {

        var userNames = "@Radeon_Inside"
        var namas = "Mahbubi"
        var jenisKelamins = "Laki-Laki"
        var nomorTelepons = "08133356070"
        var emails = "mahbubi75@gmai.com"

        var userName = binding.edtUserName.setText(userNames)
        var nama = binding.edtNama.setText(namas)
        var jenisKelamin = binding.edtJenisKelamin.setText(jenisKelamins)
        var nomorTelepon = binding.edtNomorTelepon.setText(nomorTelepons)
        var email = binding.edtEmail.setText(emails)


    }
}