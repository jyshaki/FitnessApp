package com.example.fitnessapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.fitnessapp.models.Difficulty
import com.example.fitnessapp.workouts.HomeWorkoutActivity
import com.example.fitnessapp.yoga.YogaActivity
import com.spotify.sdk.android.auth.AuthorizationClient
import com.spotify.sdk.android.auth.AuthorizationRequest
import com.spotify.sdk.android.auth.AuthorizationResponse

class MainActivity : AppCompatActivity() {
    val redirectUri = "com.example.fitnessapp://callback"
    //TODO: UZUPEŁNIĆ POLE CLIENTID PODANYM IDENTYFIKATOREM W DOKUMENTACJI
    val clientId = ""
    val request_code = 1337
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //pobranie referencji przyciskow
        val buttonHomeWorkout: Button = findViewById(R.id.button_home_workout)
        val buttonYoga: Button = findViewById(R.id.button_yoga)
        val buttonSpotify: Button = findViewById(R.id.request_authorization)

        //ustawienie eventListenerow dla przyciskow
        buttonHomeWorkout.setOnClickListener {
            showDifficultyDialog(HomeWorkoutActivity::class.java)
        }
        buttonYoga.setOnClickListener {
            showDifficultyDialog(YogaActivity::class.java)
        }
        buttonSpotify.setOnClickListener {
            val builder = AuthorizationRequest.Builder(clientId, AuthorizationResponse.Type.TOKEN, redirectUri)

            builder.setScopes(arrayOf("streaming"))
            val request: AuthorizationRequest = builder.build()

            AuthorizationClient.openLoginActivity(this, request_code, request)
        }
    }
    private fun showDifficultyDialog(activityClass: Class<*>) {
        val builder = AlertDialog.Builder(this, R.style.TransparentDialog)
        builder.setTitle("Wybierz poziom trudności:")

        val difficulties = Difficulty.values().map { it.getTranslatedName() }.toTypedArray()

        builder.setItems(difficulties) { _, which ->
            val difficulty = Difficulty.values()[which]

            val intent = Intent(this, activityClass)
            intent.putExtra("difficulty", difficulty.name)
            startActivity(intent)
        }

        builder.show()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        if (requestCode == request_code) {
            val response:AuthorizationResponse = AuthorizationClient.getResponse(resultCode, intent)
            when (response.type) {
                AuthorizationResponse.Type.TOKEN -> {
                    println("token: " + AuthorizationResponse.Type.TOKEN)
                    val spotifyContent = "https://open.spotify.com/album/0sNOF9WDwhWunNAHPD3Baj"
                    val branchLink = "https://spotify.link/content_linking?~campaign=${packageName}&\$deeplink_path=$spotifyContent&\$fallback_url=$spotifyContent"
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.data = Uri.parse(branchLink)
                    startActivity(intent)
                }
                AuthorizationResponse.Type.ERROR -> {
                    println("error: " + AuthorizationResponse.Type.ERROR)
                }
                else -> {
                    println("error: " + AuthorizationResponse.Type.ERROR)
                }
            }
        }
    }

}
