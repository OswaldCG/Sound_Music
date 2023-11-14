package com.afterloop.soundmusic.bottomnavbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Album
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.QueueMusic
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.afterloop.soundmusic.screens.Screens

//TODO Val of the Nav Bar
data class BottomNavigationItem(
    val label : String = "",
    val icon : ImageVector = Icons.Default.Home,
    val route : String = ""
) {
    fun bottomNavigationItems() : List<BottomNavigationItem>{
        return listOf(
            //TODO Home Item
            BottomNavigationItem(
                label = "Home",
                icon = Icons.Default.Home,
                route = Screens.Home.route
            ),
            //TODO Songs Item
            BottomNavigationItem(
                label = "Songs",
                icon = Icons.Default.MusicNote,
                route = Screens.Songs.route
            ),
            //TODO Albums Item
            BottomNavigationItem(
                label = "Albums",
                icon = Icons.Default.Album,
                route = Screens.Albums.route
            ),
            //TODO Playlists Item
            BottomNavigationItem(
                label = "Playlists",
                icon = Icons.Default.QueueMusic,
                route = Screens.Playlists.route
            ),
            //TODO Search Item
            BottomNavigationItem(
                label = "Search",
                icon = Icons.Default.Search,
                route = Screens.Search.route
            ),
        )
    }
}