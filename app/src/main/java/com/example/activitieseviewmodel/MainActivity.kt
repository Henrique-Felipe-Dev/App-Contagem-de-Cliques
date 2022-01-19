package com.example.activitieseviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.activitieseviewmodel.data.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val buttonClique = findViewById<Button>(R.id.buttonClique)
        val textCliques = findViewById<TextView>(R.id.textCliques)

        textCliques.text = mainViewModel.number.toString()

        buttonClique.setOnClickListener {
            mainViewModel.addNumber()
            textCliques.text = mainViewModel.number.toString()
        }

    }
}