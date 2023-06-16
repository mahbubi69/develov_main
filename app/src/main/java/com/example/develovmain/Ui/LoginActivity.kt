package com.example.develovmain.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.develovmain.core.mvvm.UserViewModel
import com.example.develovmain.databinding.ActivityLoginBinding

class   LoginActivity : AppCompatActivity() {
    private val viewModel: UserViewModel by viewModels()
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun initAction() {
        btn_lgn.setOnClickListener {

        }
    }
}