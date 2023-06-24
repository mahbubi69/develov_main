package com.example.develovmain.Ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.develovmain.R
import com.example.develovmain.databinding.ActivityPendaftaranBerhasilBinding

class PendaftaranBerhasilActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPendaftaranBerhasilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPendaftaranBerhasilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}