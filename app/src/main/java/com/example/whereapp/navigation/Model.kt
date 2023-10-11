package com.example.whereapp.navigation

sealed class Model(val route:String){
    object LaunchScreen : Model("launch_screen")
    object LoginScreen : Model("login_screen")

}
