package roh.an.exp_1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class OTPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp)

        val buttonVerifyOtp: Button = findViewById(R.id.buttonVerifyOtp)

        val textViewUsername: TextView = findViewById(R.id.textViewUsername)
        // Retrieve username from the intent
        val username = intent.getStringExtra("username")

        // Display username above the OTP EditText
        textViewUsername.text = "Username: $username"

        buttonVerifyOtp.setOnClickListener {
            onVerifyOtpButtonClick(it)
            // Call a function to handle the button click
        }
    }

    fun onVerifyOtpButtonClick(view: View) {
        // Perform any necessary actions before navigating to the next activity

        // Create an Intent to start the next activity
        val intent = Intent(this, MainActivity::class.java)

        // Optionally, you can pass data to the next activity using intent extras
        // intent.putExtra("key", "value")

        // Start the next activity
        startActivity(intent)

        // Optionally, finish the current activity to remove it from the back stack
        finish()
    }
}