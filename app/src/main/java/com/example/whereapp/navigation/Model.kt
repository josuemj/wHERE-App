package com.example.whereapp.navigation

sealed class Model(val route:String){
    object WelcomeScreen : Model("start_screen")
    object LoginScreen : Model("login_screen")
    object SignUpScreen : Model("signup_screen")

    object HomeScreen : Model("home_screen")


}
