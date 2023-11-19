package com.example.whereapp.ui.apphome.view.home

import android.content.Context
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

        fun getData(context: Context):List<Events>{
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
                    "14.60427953177033",
                    "-90.49007613679812"
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
                    "14.61859600405106",
                    "-90.51506552684549"
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
                    "14.612103744702441",
                    "-90.48525514939368",
                ),
                Events(
                    "Metrocentro Villa Nueva",
                    "Metrovillagt",
                    "https://pbs.twimg.com/profile_images/1134818793404936193/nefOu5bb_400x400.png",
                    "https://www.vidayexito.net/wp-content/uploads/2018/06/metrocentro.jpg",
                    "56",
                    "FNAF release out now",
                    "El Centro Comercial Metrocentro Villa Nueva da la bienvenida a Cinemark, compañía de la industria c" +
                            "inematográfica y de entretenimiento en Latinoamérica el cual abre sus puertas para ofrecer a la",
                    "Villa Nueva",
                    "3.4",
                    "14.51348319185099",
                    "-90.5771595245325"
                ),
                Events(
                    "Carmona Trails",
                    "carmonatrailag",
                    "https://www.guatemala.com/fotos/2023/08/Carmona-Trails-885x500.jpg",
                    "https://a.com.gt/log/imgs/2023/08/carmona-trails.jpg",
                    "256",
                    "Race day!",
                    "Actividades de ciclismo y hiking. La verdad excelente recorrido. Hay restaurante, rico y accesible en precios, solo q se llena, llegar temprano",
                    "Antigua Guatemala",
                    "4.9",
                    "14.51438676674801",
                    "-90.72170579312606"
                ),
                Events(
                    "Aurora Zoo",
                    "aurzoogt",
                    "https://www.publinews.gt/gt/wp-content/uploads/2021/03/zoologico-la-aurora-publinews.jpg",
                    "https://agn.gt/wp-content/uploads/2023/07/zoo-1.jpg",
                    "999",
                    "New friends available",
                    "Ciudad de Guatemala, 13 jul (AGN).- El Zoológico La Aurora presentó " +
                            "de manera oficial tres nuevos espacios de atracción para el público. " +
                            "Se trata de la Explanada de Balam, un nuevo recinto para flamencos del Caribe y " +
                            "un teatro educativo.",
                    "Guatemala City Z13",
                    "4.9",
                    "14.5986739",
                    "-90.525828"
                )


            )
            return eventList
        }

    }


}