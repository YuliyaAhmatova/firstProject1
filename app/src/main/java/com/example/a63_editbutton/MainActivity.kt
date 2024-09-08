package com.example.a63_editbutton

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var editTextED: EditText
    private lateinit var textViewResult: TextView
    private lateinit var textViewSymbols: TextView
    private lateinit var buttonBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        editTextED = findViewById(R.id.editTextED)
        textViewResult = findViewById(R.id.textViewResult)
        textViewSymbols = findViewById(R.id.textViewSymbols)
        buttonBTN = findViewById(R.id.buttonBTN)

        onButtonClick(buttonBTN)
    }

    fun onButtonClick(view: View) {
        val sendText = editTextED.text
        var n = 0
        textViewResult.text = sendText.reversed()
        sendText.forEach { if (it != ' ') n++ }
        textViewSymbols.text = n.toString()
    }
}