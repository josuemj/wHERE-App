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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.whereapp.R

@Composable
fun WelcomeScreen() {
    // Background image
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
            fontSize = 20.sp,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { /* TODO: Handle register click */ },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
        ) {
            Text(text = "REGISTER NOW",
                fontSize = 18.sp,
                color = Color(0xFFF8049C))
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { /* TODO: Handle login click */ },
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),

        ) {
            Text(text = "      LOGIN      ",
                fontSize = 18.sp,
                color = Color(0xFFF8049C))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}
