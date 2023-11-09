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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

import coil.compose.rememberImagePainter
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
    Scaffold(
        topBar = { topAppBar() }
    ) {innerPadding->
        LazyColumn (
            modifier = Modifier
                .padding(innerPadding)
        ){
            item {
                // Aquí va tu Box con la imagen y los iconos
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Gray)
                ) {
                    // Imagen
                    Image(
                        painter = rememberImagePainter(
                            postImage
                        ),
                        contentDescription = null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp),
                        contentScale = ContentScale.Crop
                    )

                    // Iconos en la esquina superior izquierda y derecha
                    // Icono de flecha hacia atrás
                    IconButton(
                        onClick = {
                                  navController.navigate(BottonBarModel.HomeScreen.route)
                                  },
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(16.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    // Iconos en la esquina superior derecha
                    Row(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(16.dp)
                    ) {
                        // Icono de favorito
                        IconButton(
                            onClick = { /* TODO: Acción al hacer clic en el icono */ }
                        ) {
                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = null,
                                tint = Color.White
                            )
                        }

                        // Icono de more vert
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
                // Aquí va tu Row con los iconos y textos
                // Fila con iconos y fondo de imagen
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
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

                // Texto "Vento" en negritas
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
                    // Icono de ubicación
                    Icon(imageVector = Icons.Default.LocationOn, contentDescription = "Ubicación")

                    // Texto "Zona 10" a la derecha del icono de ubicación
                    Text(text = ubication, modifier = Modifier.padding(start = 8.dp))

                    Spacer(modifier = Modifier.weight(1f)) // Esto empujará el icono de estrella y el texto "5.0" hacia la derecha

                    // Icono de estrella con acción al hacer clic
                    IconButton(onClick = {
                        // TODO: Acción al hacer clic en el icono de estrella
                    }) {
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Calificación")
                    }

                    // Texto "5.0" debajo del icono de estrella
                    Text(text = rating, modifier = Modifier.padding(end = 8.dp))
                }
            }

            item {
                // Texto "Description" en negritas
                Text(
                    text = "Description",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    textAlign = TextAlign.Left
                )
            }

            item {
                // Párrafo de Lorem Ipsum
                Text(
                    text = longDescription,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    textAlign = TextAlign.Justify
                )
            }

            item {
                // Botón "Go"
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
                        .padding(16.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFFC138)),
                    elevation = ButtonDefaults.elevation(
                        defaultElevation = 8.dp, // Elevación por defecto
                        pressedElevation = 12.dp, // Elevación cuando el botón está presionado
                        disabledElevation = 0.dp // Elevación cuando el botón está deshabilitado
                    )
                ) {
                    Text(text = "Go")
                }
            }

        }
    }
}

