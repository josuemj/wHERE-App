package com.example.whereapp.ui.apphome.view.home

import com.example.whereapp.R
import android.content.Context


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

        fun getData(context: Context):List<Events>{
            val eventList = listOf(
                Events(
                    context.getString(R.string.event_name_universidad_valle),
                    context.getString(R.string.event_username_universidad_valle),
                    "https://res.cloudinary.com/webuvg/image/upload/f_auto/v1551291989/WEB/institucional/Logo_Cuadro_Verde3x.png",
                    "https://aprende.guatemala.com/wp-content/uploads/2021/06/Lista-de-carreras-universitarias-en-la-UVG-de-la-Ciudad-de-Guatemala.jpg",
                    "999",
                    context.getString(R.string.event_description_universidad_valle),
                    context.getString(R.string.event_long_description_universidad_valle),
                    context.getString(R.string.event_ubication_universidad_valle),
                    "4.0",
                    "14.60427953177033",
                    "-90.49007613679812"
                ),

                Events(
                    context.getString(R.string.event_name_quo),
                    context.getString(R.string.event_username_quo),
                    "https://www.quo.com.gt/static/media/img2.3950c46e.png",
                    "https://upload.wikimedia.org/wikipedia/commons/8/8e/QUO_Buildings_-_51375006171.jpg",
                    "400",
                    context.getString(R.string.event_description_quo),
                    context.getString(R.string.event_long_description_quo),
                    context.getString(R.string.event_ubication_quo),
                    "4.7",
                    "14.61859600405106",
                    "-90.51506552684549"
                ),
                Events(
                    context.getString(R.string.event_name_ciudad_cayala),
                    context.getString(R.string.event_username_ciudad_cayala),
                    "https://assets-global.website-files.com/615f5753a32dcc1e9220daf6/617c02076c73e8e183778da7_LOGO%20DE%20CIUDAD%20CAYALA-01.png",
                    "https://www.guatemala.com/fotos/201711/Paseo-Cayala-885x500.jpg",
                    "304",
                    context.getString(R.string.event_description_ciudad_cayala),
                    context.getString(R.string.event_long_description_ciudad_cayala),
                    context.getString(R.string.event_ubication_ciudad_cayala),
                    "5.0",
                    "14.612103744702441",
                    "-90.48525514939368",
                ),
                Events(
                    context.getString(R.string.event_name_metrocentro),
                    context.getString(R.string.event_username_metrocentro),
                    "https://pbs.twimg.com/profile_images/1134818793404936193/nefOu5bb_400x400.png",
                    "https://www.vidayexito.net/wp-content/uploads/2018/06/metrocentro.jpg",
                    "56",
                    context.getString(R.string.event_description_metrocentro),
                    context.getString(R.string.event_long_description_metrocentro),
                    context.getString(R.string.event_ubication_metrocentro),
                    "3.4",
                    "14.51348319185099",
                    "-90.5771595245325"
                ),
                Events(
                    context.getString(R.string.event_name_carmona_trails),
                    context.getString(R.string.event_username_carmona_trails),
                    "https://www.guatemala.com/fotos/2023/08/Carmona-Trails-885x500.jpg",
                    "https://a.com.gt/log/imgs/2023/08/carmona-trails.jpg",
                    "256",
                    context.getString(R.string.event_description_carmona_trails),
                    context.getString(R.string.event_long_description_carmona_trails),
                    context.getString(R.string.event_ubication_carmona_trails),
                    "4.9",
                    "14.51438676674801",
                    "-90.72170579312606"
                )



            )
            return eventList
        }

    }


}