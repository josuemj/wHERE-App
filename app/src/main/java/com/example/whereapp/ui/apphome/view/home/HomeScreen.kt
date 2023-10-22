package com.example.whereapp.ui.apphome.view.home

import BottonNagivationApp
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whereapp.ui.apphome.view.topbar.topAppBar

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(
        bottomBar = {
            BottonNagivationApp(navController)
        },
        topBar = {
            topAppBar()
        }

    ) {
        LazyColumn(
            modifier = Modifier.padding(10.dp).fillMaxSize()
        ){
            items(Events.getData()){post->
                eventPost(
                    name = post.name,
                    username = post.username,
                    profileImage = post.profileImage,
                    postImage = post.postImage,
                    currentPeople = post.currentPeople,
                    description = post.description
                )
            }
        }
    }
}