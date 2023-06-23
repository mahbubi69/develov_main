package com.example.develovmain.Ui

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.Observer
import com.example.develovmain.R
import com.example.develovmain.core.mvvm.UserViewModel
import com.example.develovmain.core.restApi.model.LoginUserModel
import com.example.develovmain.core.restApi.model.RegisterUserModel
import com.example.develovmain.core.restApi.response.ApiUserResponseFlow
import com.example.develovmain.databinding.ActivityLoginBinding
import timber.log.Timber

class LoginActivity : AppCompatActivity() {
    private val viewModel: UserViewModel by viewModels()
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        btnLogin()
        setContentView(binding.root)
    }

    private fun initiateLoginUser(submitLogin: LoginUserModel) {


        viewModel.loginUserViewModel(submitLogin).observe(this, Observer { submit ->
            when (submit) {
                is ApiUserResponseFlow.Succes -> {
                    val intent = Intent(this, HomeActivity::class.java)
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
        binding.btnLgn.setOnClickListener {
//            Timber.d("Berhasil LogIn")
//            val email = binding.edtEmail.text.toString().trim()
//            val password = binding.edtPassword.text.toString().trim()
//
//            val loginSubmit = LoginUserModel(
//                email,
//                password
//            )
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
//            initiateLoginUser(loginSubmit)
            val intent = Intent(this@LoginActivity, NavbarActivity::class.java)
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