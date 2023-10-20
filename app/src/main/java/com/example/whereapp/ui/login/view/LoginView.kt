package com.example.whereapp.ui.theme.login.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whereapp.R
import com.example.whereapp.navigation.BottonBarModel
import com.example.whereapp.navigation.Model

@Composable
fun LoginScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        // Background image
        Image(
            painter = painterResource(id = R.drawable.login_background),
            contentDescription = "Background Image",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        // "wHERE" text positioned higher
        Text(
            "wHERE",
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.h4,
            color = MaterialTheme.colors.surface,
            modifier = Modifier.align(Alignment.TopCenter).offset(y = 170.dp)  // Comentario: Modifica el valor de y aquí para ajustar la posición vertical del texto. Por ejemplo, usa 150.dp para elevarlo más.
        )

        // Enclosing box from the middle of the screen to the bottom
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.55f)  // Comentario: Modifica este valor para ajustar la posición vertical de la Box. Por ejemplo, usa 0.4f para elevarla más.
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colors.surface)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Login",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.h6,
                    color = Color(0xFF595B70),
                    fontSize = 65.sp,
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

                Button(onClick = {
                                 navController.navigate(BottonBarModel.HomeScreen.route)
                                 },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFFA378A)))
                {
                    Text("Login",
                        color = Color.White,
                        fontSize = 20.sp,)

                }


            }
        }
    }
}
