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
                ),
                Events(
                    context.getString(R.string.event_name_zoo_aurora),
                    context.getString(R.string.event_username_zoo_aurora),
                    "https://www.guatemala.com/fotos/2023/02/El-Zoo-La-Aurora-ofrece-un-nuevo-tour-para-interactuar-con-pinguinos-en-Guatemala.jpg",
                    "https://media.tacdn.com/media/attractions-splice-spp-674x446/06/6a/a6/5f.jpg",
                    "999",
                    context.getString(R.string.event_description_zoo_aurora),
                    context.getString(R.string.event_long_description_zoo_aurora),
                    context.getString(R.string.event_ubication_zoo_aurora),
                    "3.9",
                    "14.5986739",
                    "-90.525828"
                ),
                Events(
                    context.getString(R.string.event_name_coffee_district),
                    context.getString(R.string.event_username_coffee_district),
                    "https://scontent.fgua1-2.fna.fbcdn.net/v/t39.30808-6/270110232_2930763593902384_1185861121623268921_n.png?_nc_cat=101&ccb=1-7&_nc_sid=5f2048&_nc_ohc=AxFYuNZwUGoAX_AE34H&_nc_ht=scontent.fgua1-2.fna&oh=00_AfAHEMzzJDesOhBm73Aq2uW_z8Hvus_Xn4Vq5jF4BW35-g&oe=655FC257",
                    "https://static.wixstatic.com/media/a4ba33_b1f690a95f1c46fb804436ae0a72ba9c~mv2.jpg/v1/fill/w_2500,h_1406,al_c/a4ba33_b1f690a95f1c46fb804436ae0a72ba9c~mv2.jpg",
                    "350",
                    context.getString(R.string.event_description_coffee_district),
                    context.getString(R.string.event_long_description_coffee_district),
                    context.getString(R.string.event_ubication_coffee_district),
                    "4.1",
                    "14.62078807303633",
                    "-90.51431130403384"
                ),
                Events(
                    context.getString(R.string.event_name_ruta44),
                    context.getString(R.string.event_username_ruta44),
                    "https://pbs.twimg.com/profile_images/3086271117/1232005dbd5904687913d97e64b81554_400x400.png",
                    "https://4.bp.blogspot.com/-EfPyGU-sGN8/Wi9DSbU7S_I/AAAAAAAAB0E/LZfkehts3PQ2eJYn0DtUPQqgrfhUUtufACEwYBhgL/s1600/2017-12-06%2B11.jpg",
                    "72",
                    context.getString(R.string.event_description_ruta44),
                    context.getString(R.string.event_long_description_ruta44),
                    context.getString(R.string.event_ubication_ruta44),
                    "2.3",
                    "14.609209638261637",
                    "-90.46107076138414"
                ),
                Events(
                    context.getString(R.string.event_name_mondo_coffee),
                    context.getString(R.string.event_username_mondo_coffee),
                    "https://www.guatemala.com/fotos/2023/01/Mondo-Coffee-and-Garden.jpg",
                    "https://static.tildacdn.com/tild6539-3032-4636-b538-353665363762/HEADER.jpg",
                    "23",
                    context.getString(R.string.event_description_mondo_coffee),
                    context.getString(R.string.event_long_description_mondo_coffee),
                    context.getString(R.string.event_ubication_mondo_coffee),
                    "3.0",
                    "14.621092563257328",
                    "-90.51413157723175"

                ),
                Events(
                    context.getString(R.string.event_name_acatenango_volcan),
                    context.getString(R.string.event_username_acatenango_volcan),
                    "https://lahora.gt/wp-content/uploads/sites/5/2023/04/Volcan-Acatenango.jpeg",
                    "https://media.tacdn.com/media/attractions-splice-spp-674x446/0b/9b/16/d6.jpg",
                    "230",
                    context.getString(R.string.event_description_acatenango_volcan),
                    context.getString(R.string.event_long_description_acatenango_volcan),
                    context.getString(R.string.event_ubication_acatenango_volcan),
                    "5.0",
                    "14.5004608",
                    "-90.8756662"
                ),
                Events(
                    context.getString(R.string.event_name_campustec),
                    context.getString(R.string.event_username_campustec),
                    "https://www.guatemala.com/fotos/201801/tec-700x500.png",
                    "https://images.squarespace-cdn.com/content/v1/5fa4b5ace41c003a0a498fe3/1608327108698-WUJXXGZMA447TCD4CLWA/unnamed-5-4%2Bcopia.jpg",
                    "230",
                    context.getString(R.string.event_description_campustec),
                    context.getString(R.string.event_long_description_campustec),
                    context.getString(R.string.event_ubication_campustec),
                    "5.0",
                    "14.622081014607604",
                    "-90.5136325"

                ),
                Events(
                    context.getString(R.string.event_name_westin),
                    context.getString(R.string.event_username_westin),
                    "https://guatemalacvb.com/wp-content/uploads/sites/46/2022/02/Logo-Westin2-224x166-1431542502.jpg",
                    "https://www.savacations.com/wp-content/uploads/2020/08/The-Westin-Camino-Real-Guatemala-City24.jpg",
                    "230",
                    context.getString(R.string.event_description_westin),
                    context.getString(R.string.event_long_description_westin),
                    context.getString(R.string.event_ubication_westin),
                    "5.0",
                    "14.598029",
                    "-90.5162369"

                )

            )
            return eventList
        }

    }


}