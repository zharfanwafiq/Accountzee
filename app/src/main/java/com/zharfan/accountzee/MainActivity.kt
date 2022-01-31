package com.zharfan.accountzee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.zharfan.accountzee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var loadingTimes: Int = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setHomeActivity()

    }


    private fun setHomeActivity() {
        binding.apply {
            Handler(Looper.getMainLooper()).postDelayed({
                startActivity(Intent(this@MainActivity, LoginActivity::class.java))
                finish()
            },3000)

        }
    }


}