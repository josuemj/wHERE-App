package com.example.whereapp.navigation

sealed class Model(val route:String){
    object WelcomeScreen : Model("start_screen")
    object LoginScreen : Model("login_screen")
    object SignUpScreen : Model("signup_screen")
    object ExploreScreenDetails:Model("explore_details")
    object PrivacyScreen:Model("privacy_screen")
    object AboutScreen:Model("about_screen")



    object MapScreen : Model("map_screen/{latitude}/{longitude}/{title}") {
        fun createRoute(latitude: Float, longitude: Float, title: String) =
            "map_screen/$latitude/$longitude/$title"
    }

    fun withArgs(vararg args: String):String{
        return buildString {
            append(route)
            args.forEach {
                    arg->append("/$arg")
            }
        }
    }

}
