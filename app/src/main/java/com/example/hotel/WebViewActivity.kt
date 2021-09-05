package com.example.hotel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hotel.databinding.ActivityPickerBinding
import com.example.hotel.databinding.ActivityWebViewBinding

class WebViewActivity : AppCompatActivity() {
    lateinit var binding: ActivityWebViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        binding = ActivityWebViewBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.web.loadUrl("https://turismo.org/hoteles-en-egipto/")

    }
}