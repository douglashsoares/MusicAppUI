package com.example.musicappui

import androidx.annotation.DrawableRes

data class Lib(
    @DrawableRes val icon: Int,
    val name: String
)

val libraries = listOf<Lib>(
    Lib(R.drawable.ic_playlist_green, name = "Playlist"),
    Lib(R.drawable.ic_microphone, name = "Artist"),
    Lib(R.drawable.ic_baseline_album_24, name = "Album"),
    Lib(R.drawable.ic_baseline_music_note_24, name = "Songs"),
    Lib(R.drawable.ic_genre, name = "Genre"),
)



