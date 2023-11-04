package com.example.whereapp.navigation



import ProfileScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.whereapp.ui.apphome.view.explore.ExploreScreen
import com.example.whereapp.ui.apphome.view.home.HomeScreen
import com.example.whereapp.ui.regist.view.SignUpScreen
import com.example.whereapp.ui.start.view.WelcomeScreen
import com.example.whereapp.ui.theme.login.view.LoginScreen
import com.example.whereapp.ui.login.view.LoginViewModel


@Composable
fun Navigation(
    viewModel: LoginViewModel
){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Model.WelcomeScreen.route
    ){

        composable(route = Model.WelcomeScreen.route){
            WelcomeScreen(navController = navController)
        }

        composable(route = Model.LoginScreen.route){
            LoginScreen(viewModel,navController)
        }


        composable(route = Model.SignUpScreen.route){
            SignUpScreen()
        }


        //Bottom bar navigation
        composable(route = BottonBarModel.HomeScreen.route){
            HomeScreen(navController)
        }

        composable(route = BottonBarModel.ExploreScreen.route){
            ExploreScreen(navController)
        }

        composable(route = BottonBarModel.ProfileScreen.route){
            ProfileScreen(navController)
        }



    }

}

