package com.example.labaratornaya

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.edit_email)
        val passwordEditText = findViewById<EditText>(R.id.edit_password)
        val loginButton = findViewById<Button>(R.id.btn_login)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                if (email == "admin@admin.ru" && password == "123") {
                    Toast.makeText(this, getString(R.string.welcome_message, email), Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, getString(R.string.error_auth), Toast.LENGTH_SHORT).show()
                }

            } else {
                Toast.makeText(this, getString(R.string.error_empty_fields), Toast.LENGTH_SHORT).show()
            }
        }
    }
}
