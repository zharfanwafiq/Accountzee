package com.zharfan.accountzee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.zharfan.accountzee.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setLoginToHomeActivity()
    }

    private fun setLoginToHomeActivity() {
        binding.apply {
            btnLogin.setOnClickListener{
                val email = inputEmail.text.toString()
                val password = inputPassword.text.toString()

                if (email.isEmpty() || password.isEmpty()){
                    Toast.makeText(this@LoginActivity,"Email atau Password Kosong!!",Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }else if(email == "user" || password == "user"){
                    val intent = Intent(this@LoginActivity,HomeActivity::class.java)
                    startActivity(intent)
                }

                finish()

            }

        }
    }
}