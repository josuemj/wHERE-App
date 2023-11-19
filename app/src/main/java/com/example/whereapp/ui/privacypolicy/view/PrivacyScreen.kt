package com.example.whereapp.ui.privacypolicy.view

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
fun PrivacyScreen(
    navController: NavController
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
                text = "Privacy Policy",
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
                    text = "Welcome to wHERE! At Where, we are committed to safeguarding your " +
                            "privacy and ensuring a secure and enriching experience as you explore new " +
                            "places and connect with like-minded" +
                            " individuals through our mobile application.\n"+"" +
                            "WanderSafe employs industry-standard security measures to protect user data " +
                            "from unauthorized access, " +
                            "disclosure, or alteration, ensuring a secure environment for all users.\n"+
                    "The information we collect is utilized to provide and enhance our " +
                            "services, offering personalized recommendations, real-time " +
                            "safety updates, and community-driven features. Communication channels, " +
                            "such as event notifications and promotional materials, may be utilized with the option to opt-out. Your safety information " +
                            "contributes to the continuous improvement of safety features within the app.",
                )


            }

        }
    }
}