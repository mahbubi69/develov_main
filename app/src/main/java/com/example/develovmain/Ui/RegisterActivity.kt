package com.example.develovmain.Ui

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.develovmain.R
import com.example.develovmain.core.mvvm.UserViewModel
import com.example.develovmain.core.restApi.model.RegisterUserModel
import com.example.develovmain.core.restApi.response.ApiUserResponseFlow
import com.example.develovmain.databinding.ActivityRegisterBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class RegisterActivity : AppCompatActivity() {
    private val viewModel: UserViewModel by viewModels()
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
//        btnSubmit()
        btnLogin()
        btnRegister()
        setContentView(binding.root)
    }

    private fun initiateRegisterUser(submitRegister: RegisterUserModel) {
        viewModel.registerUserViewModel(submitRegister).observe(this, Observer { submit ->
            when (submit) {
                is ApiUserResponseFlow.Succes -> {
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                }
                is ApiUserResponseFlow.Error -> {
                    messageCustomDialogLogout(submit.errorMessage)
                }
                else -> {
                    Timber.d("Unknow Error")
                }
            }
        })

    }

    private fun btnLogin() {
        binding.tvMasuk.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun btnRegister() {
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, PendaftaranBerhasilActivity::class.java)
            startActivity(intent)
        }
    }

    private fun btnSubmit() {
        binding.btnRegister.setOnClickListener {
//            Timber.d("Berhasil LogIn")
//            val nama = binding.edtNama.text.toString().trim()
//            val userName = binding.edtUserName.text.toString().trim()
//            val email = binding.edtEmail.text.toString().trim()
//            val password = binding.edtPassword.text.toString().trim()
//
//            val registerSubmit = RegisterUserModel(
//                nama,
//                userName,
//                email,
//                noHp = "0125145215",
//                password,
//                purpose = "testing purupse",
//                role = 1
//            )

//            if (nama.isEmpty()) {
//                binding.edtNama.error = "nama tidak boleh kosong"
//                binding.edtNama.requestFocus()
//                return@setOnClickListener
//            }
//
//            if (userName.isEmpty()) {
//                binding.edtUserName.error = "userName tidak boleh kosong"
//                binding.edtUserName.requestFocus()
//                return@setOnClickListener
//            }
//
//            if (email.isEmpty()) {
//                binding.edtEmail.error = "email tidak boleh kosong"
//                binding.edtEmail.requestFocus()
//                return@setOnClickListener
//            }
//
//            if (password.isEmpty()) {
//                binding.edtPassword.error = "password tidak boleh kosong"
//                binding.edtPassword.requestFocus()
//                return@setOnClickListener
//            }
//            initiateRegisterUser(registerSubmit)
            val intent = Intent(this, PendaftaranBerhasilActivity::class.java)
            startActivity(intent)
        }

    }

    private fun messageCustomDialogLogout(message: String) {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.custom_dialog_message_user)

        val tvMessage = dialog.findViewById<TextView>(R.id.tv_login_message)
        val btnOK = dialog.findViewById<Button>(R.id.btn_ok_login_message)

        tvMessage.text = message
        btnOK.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }


}


