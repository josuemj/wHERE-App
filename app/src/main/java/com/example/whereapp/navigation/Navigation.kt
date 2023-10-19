package com.example.whereapp.navigation



import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.whereapp.ui.apphome.view.HomeScreen
import com.example.whereapp.ui.regist.view.SignUpScreen
import com.example.whereapp.ui.start.view.WelcomeScreen
import com.example.whereapp.ui.theme.login.view.LoginScreen

@Composable
fun Navigation(){

    val navController = rememberNavController()
    
    NavHost(
        navController = navController,
        startDestination = Model.WelcomeScreen.route
    ){

        composable(route = Model.WelcomeScreen.route){
            WelcomeScreen(navController = navController)
        }

        composable(route = Model.LoginScreen.route){
            LoginScreen(navController)
        }

        composable(route = Model.HomeScreen.route){
            HomeScreen()
        }

        composable(route = Model.SignUpScreen.route){
            SignUpScreen()
        }


    }

}

