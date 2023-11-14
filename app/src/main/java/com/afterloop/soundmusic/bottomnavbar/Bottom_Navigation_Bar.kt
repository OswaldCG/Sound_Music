package com.afterloop.soundmusic.bottomnavbar

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
//TODO Function of the Selected Item
fun BottomNavigationBar() {
    var navigationSelectedItem by remember {
        mutableIntStateOf(0)
    }

    //TODO Val of the Nav Controller
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            Column {
                Divider(
                    color = Color.Black.copy(alpha = 0.2f),
                    thickness = 1.dp,
                    modifier = Modifier.padding(0.dp)
                )
                NavigationBar {
                    BottomNavigationItem().bottomNavigationItems().forEachIndexed { index, navigationItem ->
                        NavigationBarItem(
                            selected = index == navigationSelectedItem,
                            label = {
                                    
                            },
                            onClick = { /*TODO*/ },
                            icon = { /*TODO*/ })
                    }
                }
            }
        }
    ) {

    }
}