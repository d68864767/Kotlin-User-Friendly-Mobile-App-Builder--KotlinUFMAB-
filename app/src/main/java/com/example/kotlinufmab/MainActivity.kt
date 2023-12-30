package com.example.kotlinufmab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the AppBuilder
        val appBuilder = AppBuilder()
        appBuilder.buildApp(this)
    }
}
