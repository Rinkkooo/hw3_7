package com.example.hw3_7

import java.io.Serializable

data class Song(
    val number: String?,
    val song: String?,
    val artist: String?,
    val duration: String?
): Serializable

