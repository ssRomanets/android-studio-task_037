package com.example.task_037

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {

    private lateinit var regstrationTV: TextView
    private lateinit var linearLL:      LinearLayout
    private lateinit var signUpBTN:     Button
    private lateinit var usernameSignUpET: EditText;
    private lateinit var passwordSignUpET: EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        initUI()

        regstrationTV.animate().apply{ translationY(0.0f) }.withEndAction{
            regstrationTV.animate().apply {
                duration = 5000
                translationY(1800.0f)
            }.start()
        }

        linearLL.animate().apply{ translationY(0.0f) }.withEndAction{
            linearLL.animate().apply {
                duration = 5000
                translationY(-1200.0f)
            }.start()
        }

        signUpBTN.setOnClickListener {
            if (!usernameSignUpET.text.isEmpty() && !passwordSignUpET.text.isEmpty())
            {
                val intent = Intent(this, FinalActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun initUI() {
        regstrationTV    = findViewById(R.id.regstrationTV);
        linearLL         = findViewById(R.id.linearLL);
        signUpBTN        = findViewById(R.id.signUpBTN);
        usernameSignUpET = findViewById(R.id.usernameSignUpET);
        passwordSignUpET = findViewById(R.id.passwordSignUpET);
    }
}