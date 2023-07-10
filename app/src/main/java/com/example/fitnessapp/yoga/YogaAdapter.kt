package com.example.fitnessapp.yoga

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnessapp.R
import com.example.fitnessapp.models.YogaPose
import com.example.fitnessapp.workouts.WorkoutDetailActivity

class YogaAdapter(private val poses: List<YogaPose>) : RecyclerView.Adapter<YogaAdapter.YogaViewHolder>() {

    class YogaViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val yogaName: TextView = view.findViewById(R.id.yoga_name)
        val yogaDescription: TextView = view.findViewById(R.id.yoga_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YogaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.yoga_item, parent, false)
        return YogaViewHolder(view)
    }

    override fun onBindViewHolder(holder: YogaViewHolder, position: Int) {
        holder.yogaName.text = poses[position].name
        holder.yogaDescription.text = poses[position].description

        holder.view.setOnClickListener{
            val context = holder.view.context
            val intent = Intent(context, YogaDetailActivity::class.java)
            intent.putExtra("name", poses[position].name)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = poses.size
}