package com.example.uts_mobile

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNama = findViewById<EditText>(R.id.etNama)
        val etNim = findViewById<EditText>(R.id.etNim)
        val etJurusan = findViewById<EditText>(R.id.etJurusan)
        val btnSimpan = findViewById<Button>(R.id.btnSimpan)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        btnSimpan.setOnClickListener {

            val nama = etNama.text.toString()
            val nim = etNim.text.toString()
            val jurusan = etJurusan.text.toString()

            val hasil = "Nama: $nama\nNIM: $nim\nJurusan: $jurusan"

            tvHasil.text = hasil
        }
    }
}