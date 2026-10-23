// UTS PEMROGRAMAN FRAMEWORK, BISMILLAH!

package com.example.uts_mobile1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Deklarasi variabel untuk setiap komponen
    private lateinit var etNama: EditText
    private lateinit var etNim: EditText
    private lateinit var etJurusan: EditText
    private lateinit var btnSimpan: Button
    private lateinit var tvHasil: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hubungkan variabel pakai id
        etNama    = findViewById(R.id.etNama)
        etNim     = findViewById(R.id.etNim)
        etJurusan = findViewById(R.id.etJurusan)
        btnSimpan = findViewById(R.id.btnSimpan)
        tvHasil   = findViewById(R.id.tvHasil)

        // Pasang listener
        btnSimpan.setOnClickListener {
            simpanData()
        }
    }

    private fun simpanData() {
        // Ambil teks dari input, hapus spasi di awal/akhir
        val nama    = etNama.text.toString().trim()
        val nim     = etNim.text.toString().trim()
        val jurusan = etJurusan.text.toString().trim()

        // Validasi: jangan simpan kalau ada yang kosong
        if (nama.isEmpty() || nim.isEmpty() || jurusan.isEmpty()) {
            Toast.makeText(
                this,
                "Semua field harus diisi!",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        // Buat teks output sesuai format yang diminta
        val output = """
Nama: $nama
NIM: $nim
Jurusan: $jurusan
        """.trimIndent()

        // Tampilkan output dan jadikan tvHasil terlihat
        tvHasil.text = output
        tvHasil.visibility = View.VISIBLE
    }
}