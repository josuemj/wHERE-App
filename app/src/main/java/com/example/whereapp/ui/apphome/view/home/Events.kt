package com.example.whereapp.ui.apphome.view.home

import com.example.whereapp.R

class Events (
    val name:String,
    val username:String,
    val profileImage:String,
    val postImage:String,
    val currentPeople:String,
    val description:String,
    val longDescription:String,
    val ubication:String,
    val rating:String,
    val latitude:String,
    val longitude:String,
        ){

    companion object{

        fun getData():List<Events>{
            val eventList = listOf(
                Events("Universidad del Valle",
                    "uvgedugt",
                    "https://res.cloudinary.com/webuvg/image/upload/f_auto/v1551291989/WEB/institucional/Logo_Cuadro_Verde3x.png",
                    "https://aprende.guatemala.com/wp-content/uploads/2021/06/Lista-de-carreras-universitarias-en-la-UVG-de-la-Ciudad-de-Guatemala.jpg",
                    "999",
                    "U.S president on field",
                    "One of the best univirsities of C.A",
                    "Zone 16",
                    "4.0",
                    "23",
                    "34"
                ),
                Events("QUO",
                    "quogt",
                    "https://www.quo.com.gt/static/media/img2.3950c46e.png",
                    "https://upload.wikimedia.org/wikipedia/commons/8/8e/QUO_Buildings_-_51375006171.jpg",
                    "400",
                    "Armys on field",
                    "Just take a rest",
                    "Zone 4",
                    "4.7",
                    "23",
                    "34"
                ),
                Events("Ciudad Cayala",
                    "cayalagt",
                    "https://assets-global.website-files.com/615f5753a32dcc1e9220daf6/617c02076c73e8e183778da7_LOGO%20DE%20CIUDAD%20CAYALA-01.png",
                    "https://www.guatemala.com/fotos/201711/Paseo-Cayala-885x500.jpg",
                    "304",
                    "Oliver Heldens Rounding",
                    "People joking around",
                    "Zone 16",
                    "5.0",
                    "23",
                    "34",
                )



            )
            return eventList
        }

    }


}