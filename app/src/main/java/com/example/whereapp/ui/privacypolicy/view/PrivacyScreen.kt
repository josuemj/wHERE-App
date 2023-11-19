package com.example.whereapp.ui.privacypolicy.view

import BottonNagivationApp
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.whereapp.ui.apphome.view.topbar.topAppBar

@Composable
fun PrivacyScreen(
    navController: NavController
){
    Scaffold(

        topBar = {
            topAppBar()
        },

        ){innerPadding->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {
            Text(text = "Privacy Policy")
        }
    }
}