package com.example.whereapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.whereapp.ui.launchscreen.LaunchScreen
import com.example.whereapp.ui.theme.login.view.LoginScreen

@Composable
fun Navigation(){

    val navController = rememberNavController()
    
    NavHost(
        navController = navController,
        startDestination = Model.LaunchScreen.route
    ){

        composable(route = Model.LaunchScreen.route){
            LaunchScreen(navController = navController)
        }

        composable(route = Model.LoginScreen.route){
            LoginScreen(navController = navController)
        }


    }

}