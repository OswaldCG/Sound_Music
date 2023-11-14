package com.afterloop.soundmusic.screens

sealed class Screens (val route : String){
    //TODO Bottom Navigation Screens
    object Home : Screens("home_screen")
    object Songs : Screens("songs_screen")
    object Albums : Screens("albums_screen")
    object Playlists : Screens("playlists_screen")
    object Search : Screens("search_screen")
    //TODO Top Bar Screens
}