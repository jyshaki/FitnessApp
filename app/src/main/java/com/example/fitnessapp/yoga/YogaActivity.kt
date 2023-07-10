package com.example.fitnessapp.yoga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnessapp.R
import com.example.fitnessapp.models.Difficulty
import com.example.fitnessapp.models.Workout
import com.example.fitnessapp.models.YogaData
import com.example.fitnessapp.models.YogaPose

class YogaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga)

        val difficulty = Difficulty.valueOf(intent.getStringExtra("difficulty")!!)
        val yogas = YogaData.allYoga.filter { it.difficulty == difficulty }

        val adapter = YogaAdapter(yogas)
        val recyclerView : RecyclerView = findViewById(R.id.recycler_view)
        val manager = LinearLayoutManager(this)
        recyclerView.layoutManager = manager
        recyclerView.adapter = adapter
    }
}