package com.amit.softuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var username : EditText
    private lateinit var password : EditText
    private lateinit var login : MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding()

        login.setOnClickListener{
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

    }


    private fun binding() {
        username=findViewById(R.id.Username)
        password=findViewById(R.id.Password)
        login=findViewById(R.id.btnLogin)
    }
}