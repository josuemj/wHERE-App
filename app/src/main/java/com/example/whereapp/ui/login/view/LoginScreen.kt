package com.example.whereapp.ui.theme.login.view

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whereapp.R
import com.example.whereapp.navigation.BottonBarModel
import com.example.whereapp.ui.login.view.LoginViewModel

@Composable
fun LoginScreen(
    viewModel: LoginViewModel,
    navController: NavController
) {

    val context = LocalContext.current
    val state = viewModel.state


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
            fontSize = context.resources.getDimension(R.dimen.text_size_medium).sp,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.h4,
            color = MaterialTheme.colors.surface,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = 170.dp)
        )

        // Enclosing box from the middle of the screen to the bottom
        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.60f)
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
                    color = colorResource(id = R.color.metal_gray),
                    fontSize = context.resources.getDimension(R.dimen.text_size_small).sp,
                    modifier = Modifier.padding(bottom = 30.dp)
                )

                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 30.dp),
                    value = state.email,
                    onValueChange = { viewModel.updateEmail(it) },
                    label = { Text("Email") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null
                        )
                    }
                )

                TextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 30.dp),
                    value = state.password,
                    onValueChange = { viewModel.updatePassword(it) },
                    label = { Text("Password") },
                    visualTransformation = PasswordVisualTransformation(),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = null
                        )
                    }
                )

                Button(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(50),
                    onClick = {
                                    viewModel.login()
                                    Toast.makeText(
                                        context,
                                        LoginViewModel.staticMessage,
                                        Toast.LENGTH_SHORT)
                                        .show()

                                    if (LoginViewModel.staticMessage=="Log in Success"){
                                        navController.navigate(BottonBarModel.HomeScreen.route)
                                    }
                                 },
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.especial_magenta)))
                {
                    Text("Login",
                        color = Color.White,
                        fontSize = context.resources.getDimension(R.dimen.text_size_so_tiny).sp ,)

                }

            }
        }
    }
}
