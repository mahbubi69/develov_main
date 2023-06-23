package com.example.develovmain.Ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.develovmain.R
import com.example.develovmain.databinding.ActivityHomeBinding
import com.example.develovmain.databinding.ActivityUploadBuktiBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

       binding.cd1.setOnClickListener {
            val intent = Intent(this, BiodataActivity::class.java)
            startActivity(intent)
        }

        binding.cd2.setOnClickListener {
            val intent = Intent(this, DaftarMentor::class.java)
            startActivity(intent)
        }
    }
}