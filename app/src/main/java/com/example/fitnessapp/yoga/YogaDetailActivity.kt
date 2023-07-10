package com.example.fitnessapp.yoga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.example.fitnessapp.R
import com.example.fitnessapp.models.Difficulty
import com.example.fitnessapp.models.WorkoutData
import com.example.fitnessapp.models.YogaData
import com.example.fitnessapp.models.YogaPose

class YogaDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga_detail)
        val backButton: ImageButton = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            finish()
        }
        val name = intent.getStringExtra("name")
        val yogas = YogaData.allYoga.find { it.name == name }

        if(yogas != null) {
            val imageView: ImageView = findViewById(R.id.imageView)
            val textView: TextView = findViewById(R.id.textView)
            val textViewDescription: TextView = findViewById(R.id.textViewDescription)
            val textViewDescriptionLong: TextView = findViewById(R.id.textViewDescriptionLong)

            imageView.setImageResource(yogas.imageId)
            textView.text = yogas.name
            textViewDescription.text = yogas.description
            textViewDescriptionLong.text = yogas.descriptionLong
        } else {
            print("brak pozycji o takiej nazwie")
        }
    }
}