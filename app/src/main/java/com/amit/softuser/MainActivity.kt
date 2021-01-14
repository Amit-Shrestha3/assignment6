package com.amit.softuser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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

                val username=username.text.toString()
                val password=password.text.toString()
                nullCheck()
                if(username=="admin" && password=="admin")
                {
                    Toast.makeText(this,"Login Successfull", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                }
                else
                {
                    Toast.makeText(this, "Invalid loign", Toast.LENGTH_SHORT).show()
                }


            }
        }



    private fun binding() {
        username=findViewById(R.id.Username)
        password=findViewById(R.id.Password)
        login=findViewById(R.id.btnLogin)
    }

    private fun nullCheck()
    {
        when {
            TextUtils.isEmpty(username.text) -> {
                username.error = "Please fill username"
                username.requestFocus()
            }
            TextUtils.isEmpty(password.text) -> {
                password.error = "Please fill password"
                password.requestFocus()
            }
        }
    }
}