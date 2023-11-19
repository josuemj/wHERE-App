package com.example.whereapp.ui.aboutscreen.view

import BottonNagivationApp
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whereapp.ui.apphome.view.topbar.topAppBar

@Composable
fun AboutScreen(navController: NavController
){
    Scaffold(

        topBar = {
            topAppBar()
        },

        ){innerPadding->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {

            Text(
                modifier = Modifier.padding(10.dp),
                text = "Welcome to wHERE!",
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    fontSize = 18.sp,
                    textAlign = TextAlign.Justify,
                    text = "Explore new places and meet new people with our app.\n" +
                            "We are actively developing the app to enhance your experience. " +
                            "Stay tuned for exciting new features, including messaging!",
                )


            }

            Text(
                modifier = Modifier.padding(10.dp),
                text = "WanderSafe",
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            //wander safe text
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    fontSize = 16.sp,
                    textAlign = TextAlign.Justify,
                    text = "WanderSafe is a revolutionary mobile application designed with " +
                            "the primary goal of ensuring safe exploration and fostering " +
                            "meaningful connections. Our app is dedicated to enhancing users' experiences" +
                            " as they explore new places and connect with like-minded individuals",
                )
            }
        }
    }
}


