package com.example.whereapp.navigation



import ProfileScreen
import android.view.Display.Mode
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.whereapp.ui.apphome.view.explore.ExploreScreenDetails
import com.example.whereapp.ui.apphome.view.explore.MainExplorer
import com.example.whereapp.ui.apphome.view.explore.Place
import com.example.whereapp.ui.apphome.view.home.HomeScreen
import com.example.whereapp.ui.regist.view.SignUpScreen
import com.example.whereapp.ui.start.view.WelcomeScreen
import com.example.whereapp.ui.theme.login.view.LoginScreen
import com.example.whereapp.ui.login.view.LoginViewModel
import com.example.whereapp.ui.map.view.MapScreen
import com.example.whereapp.ui.apphome.viewModel.profile.LanguageViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.whereapp.ui.aboutscreen.view.AboutScreen
import com.example.whereapp.ui.privacypolicy.view.PrivacyScreen


@Composable
fun Navigation(
    viewModel: LoginViewModel
){

    val navController = rememberNavController()
    val languageViewModel: LanguageViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = BottonBarModel.HomeScreen.route //Regresar esta linea a Welcome Screen
    ){

        composable(route = Model.WelcomeScreen.route){
            WelcomeScreen(navController = navController)
        }

        composable(route = Model.LoginScreen.route){
            LoginScreen(viewModel,navController)
        }


        composable(route = Model.SignUpScreen.route){
            SignUpScreen(viewModel,navController)
        }

        composable(route = Model.MapScreen.route){

        }
        
        composable(route = Model.ExploreScreenDetails.route+
                "/{name}/{longDescription}/{ubication}/{rating}/{postImage}/{latitude}/{longitude}",
            arguments = listOf(
                navArgument("name"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                },
                navArgument("longDescription"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                },
                navArgument("ubication"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                },
                navArgument("rating"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                },
                navArgument("postImage"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                },
                navArgument("latitude"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                },
                navArgument("longitude"){
                    type = NavType.StringType
                    defaultValue=""
                    nullable = true
                }

            )
        )
        {
            entry->
            ExploreScreenDetails(
                navController = navController,
                name = entry.arguments?.getString("name")!!,
                longDescription = entry.arguments?.getString("longDescription")!!,
                ubication = entry.arguments?.getString("ubication")!!,
                rating = entry.arguments?.getString("rating")!!,
                postImage = entry.arguments?.getString("postImage")!!,
                latitude = entry.arguments?.getString("latitude")!!,
                longitude = entry.arguments?.getString("longitude")!!

            )
        }

        //Bottom bar navigation
        composable(route = BottonBarModel.HomeScreen.route){
            HomeScreen(navController)
        }

        composable(route = BottonBarModel.ExploreScreen.route){
            MainExplorer(navController = navController)
        }

        composable(route = BottonBarModel.ProfileScreen.route){
            ProfileScreen(navController, languageViewModel)
        }
        
        composable(
            route = Model.MapScreen.route,
            arguments = listOf(
                navArgument("latitude") { type = NavType.FloatType },
                navArgument("longitude") { type = NavType.FloatType },
                navArgument("title") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            MapScreen(
                navController = navController,
                latitude = backStackEntry.arguments?.getFloat("latitude")?.toDouble() ?: 0.0,
                longitude = backStackEntry.arguments?.getFloat("longitude")?.toDouble() ?: 0.0,
                title = backStackEntry.arguments?.getString("title") ?: ""
            )
        }

        composable(route = Model.PrivacyScreen.route){
            PrivacyScreen(navController)
        }

        composable(route = Model.AboutScreen.route){
            AboutScreen(navController)
        }

    }

}

