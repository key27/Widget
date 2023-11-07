package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var buttonShowToast: Button
    private lateinit var textView: TextView
    private lateinit var rRed: RadioButton
    private lateinit var rGreen: RadioButton
    private lateinit var rBlue: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editNama)
        buttonShowToast = findViewById(R.id.bOK)
        textView = findViewById(R.id.textV)
        rRed = findViewById(R.id.rBRed)
        rGreen = findViewById(R.id.rBGreen)
        rBlue = findViewById(R.id.rBBlue)
    }

    fun onRbClicked(view: View) {
        if (view is RadioButton) {
            val rbchecked = view.isChecked
            when (view.id) {
                R.id.rBRed -> if (rbchecked) {
                    Toast.makeText(this, "Red selected", Toast.LENGTH_SHORT).show()
                }
                R.id.rBGreen -> if (rbchecked) {
                    Toast.makeText(this, "Green selected", Toast.LENGTH_SHORT).show()
                }
                R.id.rBBlue -> if (rbchecked) {
                    Toast.makeText(this, "Blue selected", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    fun onBtnClick(view: View) {
        val enteredText = editText.text.toString()
        if (enteredText.isNotEmpty()) {
            Toast.makeText(this, enteredText, Toast.LENGTH_SHORT).show()
            textView.text = "Output: $enteredText"
            } else {
            Toast.makeText(this, "Please enter text", Toast.LENGTH_SHORT).show()
        }
    }

    fun onCbClicked(view: View) {
        if (view is CheckBox) {
            val cbchecked: Boolean = view.isChecked
            when (view.id) {
                R.id.cB19 -> if (cbchecked) {
                    Toast.makeText(this, "2019 Selected", Toast.LENGTH_SHORT).show()
                } else {Toast.makeText(this, "2019 Unselected", Toast.LENGTH_SHORT).show()}
                R.id.cB20 -> if (cbchecked) {
                    Toast.makeText(this, "2020 Selected", Toast.LENGTH_SHORT).show()
                } else {Toast.makeText(this, "2020 Unselected", Toast.LENGTH_SHORT).show()}
                R.id.cB21 -> if (cbchecked) {
                    Toast.makeText(this, "2021 Selected", Toast.LENGTH_SHORT).show()
                } else {Toast.makeText(this, "2021 Unselected", Toast.LENGTH_SHORT).show()}
                R.id.cB22 -> if (cbchecked) {
                    Toast.makeText(this, "2022 Selected", Toast.LENGTH_SHORT).show()
                } else {Toast.makeText(this, "2022 Unselected", Toast.LENGTH_SHORT).show()}
            }
        }
    }
}
