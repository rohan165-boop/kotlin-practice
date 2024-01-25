package roh.an.exp_1


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val buttonRegister: Button = findViewById(R.id.buttonRegister)
        val buttonAlreadyAccount: TextView = findViewById(R.id.alreadyHaveAccount)
        val editTextUsername: EditText = findViewById(R.id.editTextUsername)
        val editTextPassword: EditText = findViewById(R.id.editTextPassword)

        buttonRegister.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()



            onRegisterButtonClick(it, username, password)
            // Call a function to handle the button click
        }

        buttonAlreadyAccount.setOnClickListener {
            onAlreadyAccountClick(it)
            // Call a function to handle the button click
        }
    }

    fun onAlreadyAccountClick(view: View) {
        // Perform any necessary actions before navigating to the next activity


        // Create an Intent to start the next activity
        val intent = Intent(this, LoginActivity::class.java)

        // Optionally, you can pass data to the next activity using intent extras
        // intent.putExtra("key", "value")

        // Start the next activity
        startActivity(intent)

        // Optionally, finish the current activity to remove it from the back stack
        finish()
    }

    fun onRegisterButtonClick(view: View, username : String, password : String) {
        // Perform any necessary actions before navigating to the next activity

        // Create an Intent to start the next activity
        val intent = Intent(this, OTPActivity::class.java)

        // Optionally, you can pass data to the next activity using intent extras

        intent.putExtra("username", username)
        intent.putExtra("password", password)

        // Start the next activity
        startActivity(intent)

        // Optionally, finish the current activity to remove it from the back stack
        finish()
    }
}