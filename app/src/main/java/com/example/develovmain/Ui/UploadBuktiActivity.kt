package com.example.develovmain.Ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.develovmain.R
import com.example.develovmain.databinding.ActivityUploadBuktiBinding
import java.io.File

class UploadBuktiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUploadBuktiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUploadBuktiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnUp.setOnClickListener { showFileChooser() }
    }

    private fun showFileChooser() {
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type = "*/*"
        intent.addCategory(Intent.CATEGORY_OPENABLE)
        try {
            startActivityForResult(Intent.createChooser(intent, "Pilih file"), 100)
        } catch (exception: Exception) {
            Toast.makeText(this, "Please install a file manager.", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {


        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {
            val uri: Uri? = data.data
            val path: String = uri?.path.toString()
            val file = File(path)
            binding.txtResult.text = "Path: $path File name: ${file.name}".trimIndent()

        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}