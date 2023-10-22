package com.example.whereapp.navigation

import com.example.whereapp.R


sealed class BottonBarModel(
    val route:String,
    val tittle:String,
    val icon:Int
    ){
    object ExploreScreen : BottonBarModel("explore_screen","Explore", R.drawable.exploreicon)
    object ProfileScreen : BottonBarModel("profile_screen","You",R.drawable.usericon)
    object HomeScreen : BottonBarModel("home_screen","Home",R.drawable.homeicon)
}
