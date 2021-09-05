package com.example.hotel

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import com.example.hotel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addLister()
}
    private fun addLister()
    {
        binding.buttomReserva.setOnClickListener {
            startActivity(Intent(this, PickerActivity::class.java))
        }

        binding.buttomWeb.setOnClickListener { startActivity(Intent(this, WebViewActivity:: class.java)) }

    }
}

