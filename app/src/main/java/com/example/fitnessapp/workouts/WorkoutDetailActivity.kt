package com.example.fitnessapp.workouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.fitnessapp.R
import com.example.fitnessapp.models.Difficulty
import com.example.fitnessapp.models.Workout
import com.example.fitnessapp.models.WorkoutData

class WorkoutDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_detail)

        val backButton: ImageButton = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            finish()
        }

        val name = intent.getStringExtra("name")
        val workouts = WorkoutData.allWorkouts.find { it.name == name }

        if(workouts != null) {
            val imageView: ImageView = findViewById(R.id.imageView)
            val textView: TextView = findViewById(R.id.textView)
            val textViewDescription: TextView = findViewById(R.id.textViewDescription)
            val textViewDescriptionLong: TextView = findViewById(R.id.textViewDescriptionLong)

            imageView.setImageResource(workouts.imageId)
            textView.text = workouts.name
            textViewDescription.text = workouts.description
            textViewDescriptionLong.text = workouts.descriptionLong
        } else {
            print("Brak treningu o takiej nazwie")
        }

    }
}