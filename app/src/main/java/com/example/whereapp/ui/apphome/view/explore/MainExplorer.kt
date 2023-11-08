package com.example.whereapp.ui.apphome.view.explore

import BottonNagivationApp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.whereapp.ui.apphome.view.topbar.topAppBar

@Composable
fun MainExplorer(
    navController: NavController
){
    Scaffold(

        bottomBar = {
            BottonNagivationApp(navController)
        },
        topBar = {
            topAppBar()
        },

        ) { innerPadding ->
        Text(text = "Explorer main screen")
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
        ){

        }
    }
}
