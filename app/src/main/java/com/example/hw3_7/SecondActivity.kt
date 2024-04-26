package com.example.hw3_7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hw3_7.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity(), OnSongSelected {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleIntent()
    }

    private fun handleIntent() {
        val song = intent.getSerializableExtra("song") as? Song
        song?.let {
            binding.tvGetSong.text = it.toString()
        }
    }

    override fun onSongSelected(song: Song) {
    }



}