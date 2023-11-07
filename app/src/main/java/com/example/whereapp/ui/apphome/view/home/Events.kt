package com.example.whereapp.ui.apphome.view.home

import com.example.whereapp.R

class Events (
    val name:String,
    val username:String,
    val profileImage:Int,
    val postImage:Int,
    val currentPeople:Int,
    val description:String,
        ){

    companion object{

        fun getData():List<Events>{
            val eventList = listOf(
                Events("4 grados norte",
                    "4grnorte",
                    R.drawable.profile_4grados,
                    R.drawable.gradosnorte,
                    103,
                    "Miko in zone!"),
                Events("Universidad del Valle",
                    "uvgedugt",
                    R.drawable.profile_uvg,
                    R.drawable.poster_uvg,
                    2300,
                    "U.S president on field"),
                Events("Ciudad Cayala",
                    "cayalagt",
                    R.drawable.profile_cayala,
                    R.drawable.post_cayala,
                    103,
                    "Black friday!")
            )
            return eventList
        }

    }


}