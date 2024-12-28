/*
package com.example.test
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView

class FinalPageActivity : AppCompatActivity() {

    private lateinit var subjectTextView: TextView
    private lateinit var degreesCard: CardView
    private lateinit var degreesRecyclerView: RecyclerView
    private lateinit var chatbotLayout: LinearLayout
    private lateinit var lottieAnimationView: LottieAnimationView

    private val degrees = listOf(
        Degree("Computer Science", R.drawable.computer_science, 87),
        Degree("Mechanical Engineering", R.drawable.mechanical_engineering, 72),
        Degree("Data Science", R.drawable.data_science, 93)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_page)

        subjectTextView = findViewById(R.id.subjectTextView)
        degreesCard = findViewById(R.id.degreesCard)
        degreesRecyclerView = findViewById(R.id.degreesRecyclerView)
        chatbotLayout = findViewById(R.id.chatbotLayout)
        lottieAnimationView = findViewById(R.id.lottieAnimationView)

        // Initialize RecyclerView
        degreesRecyclerView.layoutManager = LinearLayoutManager(this)
        degreesRecyclerView.adapter = DegreesAdapter(degrees)

        // Party Popper Animation
        showPartyPopperAnimation()

        // Display Subject Name
        subjectTextView.text = "You like: Engineering"

        // Slide Up Card After 5 Seconds
        Handler(Looper.getMainLooper()).postDelayed({
            degreesCard.visibility = View.VISIBLE
            degreesCard.animate().translationY(0f).setDuration(1000).start()
        }, 5000)

        // Show Chatbot After Degrees
        Handler(Looper.getMainLooper()).postDelayed({
            chatbotLayout.visibility = View.VISIBLE
        }, 8000)
    }

    private fun showPartyPopperAnimation() {
        lottieAnimationView.setAnimation(R.raw.party_popper)
        lottieAnimationView.playAnimation()
        lottieAnimationView.addAnimatorUpdateListener {
            if (it.animatedFraction == 1f) {
                lottieAnimationView.visibility = View.GONE
            }
        }
    }
}
*/
