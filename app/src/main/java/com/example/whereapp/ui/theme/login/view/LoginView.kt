package com.example.whereapp.ui.theme.login.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import com.example.whereapp.R

@Composable
fun LoginScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        // Background image
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // TopAppBar for icons
        TopAppBar(
            title = { /* No title */ },
            navigationIcon = {
                IconButton(onClick = { /* Handle navigation icon click */ }) {
                    Icon(Icons.Default.Menu, contentDescription = "Menu", tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = { /* Handle search icon click */ }) {
                    Icon(Icons.Default.Search, contentDescription = "Search", tint = Color.White)
                }
            },
            backgroundColor = Color.Transparent,
            elevation = 0.dp
        )

        // "wHERE" text positioned higher
        Text(
            "wHERE",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.h4,
            color = MaterialTheme.colors.surface,
            modifier = Modifier.align(Alignment.TopCenter).offset(y = 200.dp)
        )

        // Enclosing box from the middle of the screen to the bottom
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colors.surface)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Login",
                    fontWeight = FontWeight.Normal,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.padding(bottom = 30.dp)
                )

                val (username, setUsername) = remember { mutableStateOf(TextFieldValue()) }
                val (password, setPassword) = remember { mutableStateOf(TextFieldValue()) }

                TextField(
                    value = username,
                    onValueChange = { setUsername(it) },
                    label = { Text("User") },
                    modifier = Modifier.fillMaxWidth().padding(bottom = 40.dp)
                )

                TextField(
                    value = password,
                    onValueChange = { setPassword(it) },
                    label = { Text("Password") },
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier.fillMaxWidth().padding(bottom = 30.dp)
                )

                Button(onClick = { /* Handle login button click */ }) {
                    Text("Login")
                }

                Text(
                    "Don't have an account? Sign Up",
                    color = Color.Gray,
                    modifier = Modifier.padding(top = 15.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen() {
    LoginScreen()
}
