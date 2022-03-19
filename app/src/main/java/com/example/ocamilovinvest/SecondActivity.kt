package com.example.ocamilovinvest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ocamilovinvest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val url = "https://t.me/otabekocamilov"
        binding.btn.loadUrl(url)
    }
}