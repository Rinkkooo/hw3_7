package com.example.hw3_7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.image_fragment, ImageFragment()).add(R.id.recycler_fragment, RecyclerFragment()).commit()
    }
}