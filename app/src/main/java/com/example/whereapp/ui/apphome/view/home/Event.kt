package com.example.whereapp.ui.apphome.view.home

import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.whereapp.R
import com.example.whereapp.navigation.BottonBarModel
import com.example.whereapp.navigation.Model
import android.net.Uri // Import Uri from android.net



/**
 * Body
 */
@Composable
fun eventPost(

    name:String,
    username:String,
    profileImage:String,
    postImage:String,
    currentPeople:String,
    description:String,
    longDescription:String,
    ubication:String,
    rating:String,
    latitude:String,
    longitude:String,
    navController: NavController

)
{

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)

            ){
        publisherBox(
            profileImage,
            name,
            username,
            navController
        )

        publisherCard(
            name,
            username,
            profileImage,
            postImage,
            currentPeople,
            description,
            ubication,
            rating,
            latitude,
            longitude,
            longDescription,
            navController
        )

        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(10.dp)
        )

        Box(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(Color(0xFFDBD6D6))){
        }
        Spacer(modifier = Modifier.fillMaxWidth().height(10.dp))



    }
}

/**
 * User/place information
 */
@Composable
fun publisherBox(
    image:String,
    place:String,
    username:String,
    navController: NavController
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color.Transparent)
    ){

        Row() {
            
            
            imageProfile(image = image, place = place)
            
            Box(modifier = Modifier.weight(1f)){
                Column (
                    modifier = Modifier.fillMaxHeight()
                    ){
                    Text(
                        modifier = Modifier.padding(start = 5.dp),
                        text = place,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Text(
                        modifier = Modifier.padding(start = 5.dp),
                        text = "@$username"
                    )
                }
            }

            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.background(Color.Transparent)
            ) {
                Icon(painter = painterResource(id = R.drawable.icon_postoption), contentDescription = null)
            }


        }

    }
}

/**
 *
 */
@Composable
fun publisherCard(
    name:String,
    username:String,
    profileImage:String,
    postImage: String,
    currentPeople:String,
    placeDescription:String,
    ubication:String,
    rating:String,
    latitude:String,
    longitude:String,
    longDescription: String,
    navController: NavController
) {


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(290.dp)
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(Color.Red, Color(0xFFE7b8b8)),
                ),
                shape = RoundedCornerShape(15.dp) // Set rounded corners
            )
            .clickable {
                navController.navigate(Model.ExploreScreenDetails.withArgs(
                    name,longDescription,ubication,rating,Uri.encode(postImage)
                ))
                println("Args success passed :)")
            }


    ) {


            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Box() {
                    Card(

                        modifier = Modifier
                            .fillMaxWidth()
                            .height(230.dp),
                        shape = RoundedCornerShape(15.dp),
                        elevation = 5.dp
                    ) {
                        postImage(postImage)
                    }
                }
                placeDescription(placeDescription,currentPeople)
            }


    }

}

@Composable
fun placeDescription(
    userDescription:String,
    currentUsers:String
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
    ){
        Row(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(60.dp),
                contentAlignment = Alignment.CenterStart

            ) {
                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = userDescription,
                    fontSize = 16.sp,
                    color = Color.White
                )
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .height(60.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(){
                    Spacer(modifier = Modifier.width(20.dp))
                    Icon(
                        modifier = Modifier
                            .size(30.dp),
                        painter = painterResource(id = R.drawable.icon_map),
                        contentDescription = "map",
                        tint = Color.White
                    )
                    Text(
                        modifier = Modifier.padding(start = 10.dp, end = 40.dp),
                        text = "+"+currentUsers,
                        fontSize = 18.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    Icon(
                        modifier = Modifier
                            .size(30.dp),
                        painter = painterResource(id = R.drawable.icons_persons),
                        contentDescription = "people",
                        tint = Color.White
                    )

                }

            }
        }

    }
}

@Composable
fun postImage(
    image:String
){
    Image(

        painter = rememberImagePainter(image),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}


@Composable
fun imageProfile(
    image:String,
    place:String
){
    Image(
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .clickable {

            },
        painter = rememberImagePainter(image),
        contentDescription = place,
        contentScale = ContentScale.Crop
    )
}



