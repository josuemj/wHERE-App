package com.example.whereapp.ui.apphome.view.home

import BottonNagivationApp
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whereapp.ui.apphome.view.topbar.topAppBar

@Composable
fun HomeScreen(navController: NavController){
    // Obtener el Context actual de Compose
    val context = LocalContext.current

    // Ahora puedes pasar este Context a tu método getData()
    val eventsList = Events.getData(context)

        Scaffold(

            bottomBar = {
                BottonNagivationApp(navController)
            },
            topBar = {
                topAppBar()
            },

        ) { innerPadding ->

            LazyColumn(

                modifier = Modifier
                    .padding(innerPadding).padding(12.dp)
            ){
                items(Events.getData(context)){post->
                    eventPost(
                        name = post.name,
                        username = post.username,
                        profileImage = post.profileImage,
                        postImage = post.postImage,
                        currentPeople = post.currentPeople,
                        description = post.description,
                        longDescription = post.longDescription,
                        ubication = post.ubication,
                        rating = post.rating,
                        latitude = post.latitude,
                        longitude = post.longitude,
                        navController = navController
                    )
                }
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(500.dp)
            )
        }

}