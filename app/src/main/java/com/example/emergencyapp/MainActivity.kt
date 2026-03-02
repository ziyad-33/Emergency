package com.example.emergencyapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val emergencies =arrayListOf<Emergency>()
        emergencies.add(Emergency(R.drawable.a , "child rescue" , "16000"))
        emergencies.add(Emergency(R.drawable.d , "police" , "16000"))
        emergencies.add(Emergency(R.drawable.b, " fire " , "16000"))
        emergencies.add(Emergency(R.drawable.c , "Ambulance" , "16000"))
    }
}