package com.example.hotel

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.hotel.databinding.ActivityPickerBinding
import com.google.android.material.snackbar.Snackbar

class PickerActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var binding: ActivityPickerBinding
    lateinit var view: View
    private var options =
        arrayListOf("Habitacion Comun", "Habitacion con vista", "Suite con Terraza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPickerBinding.inflate(layoutInflater)
        view = binding.root
        setContentView(view)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val spinnerAdapter = ArrayAdapter(
            this,
            R.layout.support_simple_spinner_dropdown_item,
            options,
        )
        binding.spinnerActivity.apply {
            adapter = spinnerAdapter
            setSelection(0, true)
            onItemSelectedListener = this@PickerActivity
        }
        showPickerSelected()
        addListener()
    }

    private fun showPickerSelected() {
    }

    private fun addListener() {
        binding.confirmacion.setOnClickListener {
            hidekeyboard()
            var message =
                "Reservacion: ${binding.nom.text},${binding.ape.text},${binding.spinnerActivity}"
            if (binding.nom.text.isBlank()) {
                message = "El nombre esta vacio"
            }
            if (binding.ape.text.isBlank()) {
                message = "El apellido esta vacio"
            }
            Snackbar.make(it, message, Snackbar.LENGTH_SHORT).show()

        }


    }
    private fun hideKeyboard() {
        val manager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        manager.hideSoftInputFromWindow(view.windowToken, 0)
    }
    private fun hidekeyboard() {

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}





