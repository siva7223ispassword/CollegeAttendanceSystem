package com.college.studentapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Redirect to LoginActivity on startup
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}