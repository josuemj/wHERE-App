package com.example.whereapp.ui.start.view

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.whereapp.R
import com.example.whereapp.navigation.Model

@Composable
fun WelcomeScreen(navController: NavController) {
    val context = LocalContext.current

    Image(
        painter = painterResource(id = R.drawable.welcome_background),
        contentDescription = "Background Image",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 150.dp)
            .padding(start = 70.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Hi welcome",
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White

        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "How, when, where?",
            fontSize = context.resources.getDimension(R.dimen.text_size_tiny).sp,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(8.dp))

        /**
         * Sign up navigation
         */
        Button(
            onClick = {
                        navController.navigate(Model.SignUpScreen.route)
                      },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
        ) {
            Text(text = "REGISTER NOW",
                fontSize = 20.sp,
                color = colorResource(id = R.color.shart))
        }

        Spacer(modifier = Modifier.height(8.dp))

        /**
         * Login navigation
         */
        Button(
            onClick = {
                      navController.navigate(Model.LoginScreen.route)
                      },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),

        ) {
            Text(text = "      LOGIN      ",
                fontSize = 23.sp,
                color = colorResource(id = R.color.shart))
        }
    }
}

