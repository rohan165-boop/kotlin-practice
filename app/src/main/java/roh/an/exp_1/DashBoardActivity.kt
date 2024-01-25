package roh.an.exp_1


import android.os.Bundle

import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class DashBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)



        val textViewUsername: TextView = findViewById(R.id.dashItem1)
        // Retrieve username from the intent
        val username = intent.getStringExtra("username")

        // Display username above the OTP EditText
        textViewUsername.text = "Username: $username"}


    }