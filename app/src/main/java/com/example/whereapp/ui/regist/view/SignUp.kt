package com.example.whereapp.ui.regist.view

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whereapp.R
import com.example.whereapp.navigation.BottonBarModel
import com.example.whereapp.navigation.Model
import com.example.whereapp.ui.login.view.LoginViewModel

@Composable
fun SignUpScreen(

    viewModel: LoginViewModel,
    navController: NavController

){

    val context = LocalContext.current
    val state = viewModel.state
    val passwordState = remember { mutableStateOf(TextFieldValue()) }
    val passwordConfirmationState = remember { mutableStateOf(TextFieldValue()) }



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
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = 170.dp)
        )

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .fillMaxHeight(0.64f)
                .clip(RoundedCornerShape(16.dp))
                .background(MaterialTheme.colors.surface)
        ) {
            Column(
                modifier = Modifier.padding(context.resources.getDimension(R.dimen.padding_small).dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Sign Up",
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.h6,
                    color = colorResource(id = R.color.metal_gray),
                    fontSize = context.resources.getDimension(R.dimen.text_size_big).sp,
                    modifier = Modifier.padding(bottom = 30.dp)
                )


                TextField(
                    value = state.email,
                    onValueChange = { viewModel.updateEmail(it) },
                    label = { Text("Email") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = context.resources.getDimension(R.dimen.padding_medium).dp),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null
                        )
                    }
                )

                TextField(
                    value = passwordState.value,
                    onValueChange = {  passwordState.value=it },
                    label = { Text("Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = context.resources.getDimension(R.dimen.padding_medium).dp),
                    visualTransformation = PasswordVisualTransformation(),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = null
                        )
                    }

                )

                TextField(
                    value = passwordConfirmationState.value,
                    onValueChange = { passwordConfirmationState.value = it },
                    label = { Text("Confirm password") },
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = context.resources.getDimension(R.dimen.padding_medium).dp),
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
                        if (passwordState.value.text == passwordConfirmationState.value.text) {
                            state.password = passwordState.value.text
                            viewModel.signIn()
                            Toast.makeText(
                                context,
                                LoginViewModel.staticMessage,
                                Toast.LENGTH_SHORT)
                                .show()
                            navController.navigate(Model.WelcomeScreen.route)
                        } else {
                            Toast.makeText(
                                context,
                                "Password does not match",
                                Toast.LENGTH_SHORT)
                                .show()
                        }

                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.especial_magenta)))
                {
                    Text("Sign Up",
                        color = Color.White,
                        fontSize = context.resources.getDimension(R.dimen.text_size_tiny).sp,)
                }


            }
        }
    }
}