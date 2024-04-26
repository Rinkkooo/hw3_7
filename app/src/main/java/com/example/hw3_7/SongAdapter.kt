package com.example.hw3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw3_7.databinding.ItemSongBinding

class SongAdapter(private val songList: List<Song>, private val listener: OnSongSelected): RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemSongBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding, listener)
    }

    override fun getItemCount(): Int = songList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(songList[position], position)
        }
    }


class ViewHolder(private val binding: ItemSongBinding, private val listener: OnSongSelected): RecyclerView.ViewHolder(binding.root){

    fun onBind(song: Song, position: Int){
        (position + 1).toString().also { binding.tvNumber.text = it }
        binding.tvSong.text = song.song
        binding.tvArtist.text = song.artist
        binding.tvDuration.text = song.duration


        itemView.setOnClickListener{
            listener.onSongSelected(song)
        }
    }


}