package com.example.whereapp.ui.apphome.view.explore
import androidx.compose.foundation.Image
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

import androidx.navigation.NavController
import com.example.whereapp.ui.apphome.view.topbar.topAppBar



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.unit.dp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import coil.compose.rememberImagePainter
import com.example.whereapp.R
import com.example.whereapp.navigation.BottonBarModel
import com.example.whereapp.navigation.Model


@Composable
fun ExploreScreenDetails(
    navController: NavController,
    name:String,
    longDescription:String,
    ubication:String,
    rating:String,
    postImage:String,
    latitude:String,
    longitude:String
) {
    val context = LocalContext.current
    // Acceder a los recursos de dimensiones
    Scaffold(
        topBar = { topAppBar() }
    ) {innerPadding->
        LazyColumn (
            modifier = Modifier
                .padding(innerPadding)
        ){
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Gray)
                ) {

                    Image(
                        painter = rememberImagePainter(
                            postImage
                        ),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(context.resources.getDimension(R.dimen.image_size_big).dp),
                        contentScale = ContentScale.Crop
                    )
                    IconButton(
                        onClick = {
                                  navController.navigate(BottonBarModel.HomeScreen.route)
                                  },
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(context.resources.getDimension(R.dimen.padding_small).dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    Row(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(context.resources.getDimension(R.dimen.padding_small).dp)

                    ) {
                        IconButton(
                            onClick = { /* TODO: Acción al hacer clic en el icono */ }
                        ) {
                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = null,
                                tint = Color.White
                            )
                        }
                        IconButton(
                            onClick = { /* TODO: Acción al hacer clic en el icono */ }
                        ) {
                            Icon(
                                imageVector = Icons.Default.MoreVert,
                                contentDescription = null,
                                tint = Color.White
                            )
                        }
                    }
                }
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(context.resources.getDimension(R.dimen.padding_small).dp)
                        .background(Color.Gray),


                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    IconButton(onClick = {
                        // TODO: Acción al hacer clic en el icono de Email
                    }) {
                        Icon(imageVector = Icons.Default.Email, contentDescription = "Email")
                    }

                    IconButton(onClick = {
                        // TODO: Acción al hacer clic en el icono de Add
                    }) {
                        Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
                    }

                    Spacer(modifier = Modifier.weight(1f)) // Esto empujará el icono de persona hacia la derecha

                    IconButton(onClick = {
                        // TODO: Acción al hacer clic en el icono de Face (Persona)
                    }) {
                        Icon(imageVector = Icons.Default.Face, contentDescription = "Persona")
                    }
                }
            }

            item {
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 16.dp, top = 8.dp)
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(imageVector = Icons.Default.LocationOn, contentDescription = "Ubicación")

                    Text(text = ubication, modifier = Modifier.padding(start = 8.dp))

                    Spacer(modifier = Modifier.weight(1f))

                    IconButton(onClick = {
                        // TODO: Acción al hacer clic en el icono de estrella
                    }) {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Calificación")
                    }

                    Text(text = rating, modifier = Modifier.padding(end = 8.dp))
                }
            }

            item {
                Text(
                    text = "Description",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(context.resources.getDimension(R.dimen.padding_small).dp),
                    textAlign = TextAlign.Left
                )
            }

            item {
                Text(
                    text = longDescription,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(context.resources.getDimension(R.dimen.padding_small).dp),
                    textAlign = TextAlign.Justify
                )
            }

            item {
                Button(
                    onClick = {
                        navController.navigate(
                            Model.MapScreen.createRoute(
                                latitude = latitude.toFloat(),
                                longitude = longitude.toFloat(),
                                title = name,
                            )
                        )

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(context.resources.getDimension(R.dimen.padding_small).dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.especial_yellow)),
                    elevation = ButtonDefaults.elevation(
                        defaultElevation = 8.dp,
                        pressedElevation = 12.dp,
                        disabledElevation = 0.dp
                    )
                ) {
                    Text(text = "Go")
                }
            }

        }
    }
}

