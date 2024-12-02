package com.example.task_037

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageViewIV: ImageView
    private lateinit var combinationBTN: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()

        val animationImage = AnimationUtils.loadAnimation(applicationContext, R.anim.visibility)
        imageViewIV.startAnimation(animationImage)

        combinationBTN.animate().apply{
            translationX(0.0f)
        }.withEndAction{
            combinationBTN.animate().apply {
                duration = 3000
                translationX(365.0f)
            }.start()
        }

        combinationBTN.setOnClickListener{
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initUI() {
        imageViewIV = findViewById(R.id.imageViewIV);
        combinationBTN = findViewById(R.id.combinationBTN);
    }
}