package com.example.whereapp.ui.apphome.view.home

import BottonNagivationApp
import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(
        bottomBar = {
            BottonNagivationApp(navController)
        }
    ) {
        Text(text = "HOME SCREEN", fontSize = 14.sp)
    }
}