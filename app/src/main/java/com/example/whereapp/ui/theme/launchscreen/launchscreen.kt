package com.example.whereapp.ui.theme.launchscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.whereapp.navigation.Model

/**
 * This composable represents [launching_screen]
 * Will be the first screen that user will see.
 * @param navController
 */

@Composable
fun LaunchScreen(navController: NavController){

    /*TODO modificable*/
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        Column(

        ) {
            Text(
                text = "Launch screen"
            )

            /**
             * Button shape and type can be changed except for [onClick]
             */
            Button(
                onClick = {

                })
            {

            }
        }

    }

}