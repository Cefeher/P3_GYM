package com.cefehe.p3_gym

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.cefehe.p3_gym.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_P3_GYM)
        super.onCreate(savedInstanceState)

        setContentView(ActivityMainBinding.inflate(layoutInflater).also { binding = it }.root)

        setSupportActionBar(binding.toolbar)

        binding.btnCrossfit.setOnClickListener {
            startActivity(Intent(this, Crossfit::class.java))
        }
    }
}