import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnessapp.R

import com.example.fitnessapp.models.Workout
import com.example.fitnessapp.workouts.WorkoutDetailActivity

class WorkoutAdapter(private val workouts: List<Workout>) : RecyclerView.Adapter<WorkoutAdapter.WorkoutViewHolder>() {

    class WorkoutViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val workoutName: TextView = view.findViewById(R.id.workout_name)
        val workoutDescription: TextView = view.findViewById(R.id.workout_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WorkoutViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.workout_item, parent, false)
        return WorkoutViewHolder(view)
    }

    override fun onBindViewHolder(holder: WorkoutViewHolder, position: Int) {
        holder.workoutName.text = workouts[position].name
        holder.workoutDescription.text = workouts[position].description

        holder.view.setOnClickListener {
            val context = holder.view.context
            val intent = Intent(context, WorkoutDetailActivity::class.java)
            intent.putExtra("name", workouts[position].name)
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = workouts.size
}