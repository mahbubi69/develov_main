package com.example.develovmain.Ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.develovmain.R
import com.example.develovmain.databinding.ActivityPembayaranBinding

class PembayaranActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPembayaranBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPembayaranBinding.inflate(layoutInflater)
        selectionRadioButton()
        setContentView(binding.root)
    }

    private fun selectionRadioButton() {
        binding.radioGrup.setOnCheckedChangeListener { group, checkedId ->
            val text = "kamu memilih: "
            if (R.id.rd_1 == checkedId) {
                Toast.makeText(applicationContext, text + "BNI", Toast.LENGTH_SHORT).show()
            } else if (R.id.rd_2 == checkedId) {
                Toast.makeText(applicationContext, text + "BCA", Toast.LENGTH_SHORT).show()
            } else if (R.id.rd_3 == checkedId) {
                Toast.makeText(applicationContext, text + "MANDIRI", Toast.LENGTH_SHORT).show()
            } else if (R.id.rd_4 == checkedId) {
                Toast.makeText(applicationContext, text + "DANA", Toast.LENGTH_SHORT).show()
            }

        }

    }
}