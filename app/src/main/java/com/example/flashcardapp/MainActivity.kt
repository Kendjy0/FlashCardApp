package com.example.flashcardapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val flashcard_question = findViewById<TextView>(R.id.flashcard_question)
        val flashcard_reponse = findViewById<TextView>(R.id.flashcard_reponse)
        flashcard_question.setOnClickListener {
            flashcard_question.visibility = View.INVISIBLE
            flashcard_reponse.visibility = View.VISIBLE
        }
    }
}