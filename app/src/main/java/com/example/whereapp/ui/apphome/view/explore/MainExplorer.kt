package com.example.whereapp.ui.apphome.view.explore

import BottonNagivationApp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.example.whereapp.ui.apphome.view.topbar.topAppBar

import com.example.whereapp.ui.apphome.view.home.Events


@Composable
fun MainExplorer(
    navController: NavController,
){
                val context = LocalContext.current

                val eventsList = Events.getData(context)
                val randIndex = (eventsList.indices).random()

                val randomEvent = eventsList[randIndex]

                val event: Events = Events(
                    name = randomEvent.name,
                    username = randomEvent.username,
                    profileImage = randomEvent.profileImage,
                    postImage = randomEvent.postImage,
                    currentPeople = randomEvent.currentPeople,
                    description = randomEvent.description,
                    longDescription = randomEvent.longDescription,
                    ubication = randomEvent.ubication,
                    rating = randomEvent.rating,
                    latitude = randomEvent.latitude,
                    longitude = randomEvent.longitude,
                )
                ExploreScreenDetails(
                    navController = navController,
                    name = event.name,
                    longDescription = event.longDescription,
                    ubication = event.ubication,
                    rating = event.rating,
                    postImage = event.postImage,
                    latitude = event.latitude,
                    longitude = event.longitude
                )
}
