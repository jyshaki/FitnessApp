package com.example.fitnessapp.workouts

import WorkoutAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnessapp.R
import com.example.fitnessapp.models.Difficulty
import com.example.fitnessapp.models.Workout
import com.example.fitnessapp.models.WorkoutData

class HomeWorkoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_workout)

        val difficulty = Difficulty.valueOf(intent.getStringExtra("difficulty")!!)
        val workouts = WorkoutData.allWorkouts.filter { it.difficulty == difficulty }

        val adapter = WorkoutAdapter(workouts)
        val recyclerView : RecyclerView = findViewById(R.id.recycler_view)
        val manager = LinearLayoutManager(this)
        recyclerView.layoutManager = manager
        recyclerView.adapter = adapter
    }
}