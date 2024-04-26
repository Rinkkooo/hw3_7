package com.example.hw3_7

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hw3_7.databinding.FragmentRecyclerBinding

class RecyclerFragment : Fragment() {
    private lateinit var binding: FragmentRecyclerBinding
    private val songList = arrayListOf(
        Song("", "Pink Phloyd", "Pharaoh", "3:14"),
        Song("", "Проблемы", "Pharaoh", "4:15"),
        Song("", "Дико,например", "Pharaoh", "2:48"),
        Song("", "Школа", "Pharaoh", "3:18"),
        Song("", "Твое место", "Pharaoh", "2:43"),
        Song("", "Реквием по эго", "Pharaoh", "2:08"),
        Song("", "Лаллипап", "Pharaoh", "2:43"),
        Song("", "Louis Vuitton Kiss", "Pharaoh", "4:19"),
        Song("", "Одним целым", "Pharaoh", "2:46"),
        Song("", "Много дел", "Pharaoh", "2:44"),
        Song("", "Одинокая звезда", "Pharaoh", "3:15"),

        )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRecyclerBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = SongAdapter(songList, object: OnSongSelected{
            override fun onSongSelected(song: Song){
                Log.d("RecyclerFragment", "Selected song $song")
                val intent = Intent(requireContext(), SecondActivity::class.java)
                intent.putExtra("song", song)
                startActivity(intent)
            }
        })

        binding.rvSongs.adapter = adapter



    }


}