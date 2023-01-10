package com.example.aplikasiresponsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.aplikasiresponsi.R.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_login)

        val btnlogin = findViewById<Button>(R.id.btnlogin)
        btnlogin.setOnClickListener {
            val Intent = Intent( this,HomeActivity::class.java)
            startActivity(Intent)
        }
    }
}