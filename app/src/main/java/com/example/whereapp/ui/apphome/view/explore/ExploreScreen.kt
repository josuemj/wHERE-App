package com.example.whereapp.ui.apphome.view.explore

import BottonNagivationApp
import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whereapp.ui.apphome.view.topbar.topAppBar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ExploreScreen(navController: NavController){
    Scaffold(
        bottomBar = {
            BottonNagivationApp(navController)
        },
        topBar = { topAppBar()}
    ) {
        Text(text = "EXPLORE SCREEN", fontSize = 14.sp)

    }
}