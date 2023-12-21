// LoginActivity.kt
package com.example.finaldicoding

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.finaldicoding.MainActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val editTextUsername = findViewById<EditText>(R.id.editTextUsername)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            // Contoh: Verifikasi username dan password
            if (username == "yayat" && password == "indonesia") {
                // Jika login berhasil, pindah ke activity_main
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish() // Optional, untuk menutup activity login
            } else {
                // Jika login gagal, berikan pesan kesalahan
                // Anda dapat menambahkan logika lain sesuai kebutuhan
                // (misalnya menampilkan pesan kesalahan di UI)
            }
        }
    }
}
