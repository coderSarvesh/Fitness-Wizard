package com.psp.fitnesswizard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reportsActivity = findViewById<Button>(R.id.viewReports)
        val exerciseActivity = findViewById<CardView>(R.id.exerciseView)
        val dietActivity = findViewById<CardView>(R.id.dietView)

        reportsActivity.setOnClickListener{
            val intent = Intent(this, ReportsActivity::class.java)
            startActivity(intent)
        }
        exerciseActivity.setOnClickListener{
            val intent = Intent(this, ExerciseActivity::class.java)
            startActivity(intent)
        }
        dietActivity.setOnClickListener{
            val intent = Intent(this, DietActivity::class.java)
            startActivity(intent)
        }
    }
}