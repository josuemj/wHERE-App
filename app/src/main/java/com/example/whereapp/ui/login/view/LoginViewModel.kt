package com.example.whereapp.ui.login.view

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await

class LoginViewModel:ViewModel() {

    companion object {
        var staticMessage = ""
    }

    var state by mutableStateOf(LoginState())
        private set

    fun updateEmail(email:String){
        state = state.copy(
            email = email
        )
    }

    fun updatePassword(password:String){
        state = state.copy(
            password = password
        )
    }

    fun login(){
        viewModelScope.launch {
            try{
                val result = Firebase.auth.signInWithEmailAndPassword(state.email,state.password).await()
                    staticMessage = "Log in Success"

            }catch (e:Exception){
                val message = e.message.toString()
                println(message)
                staticMessage = message
            }
        }


    }

    fun signIn(){
        viewModelScope.launch {
            try{
                val sigIng = Firebase.auth.createUserWithEmailAndPassword(state.email,state.password).await()
                println("Sign in success")
                staticMessage = "Sign in Success"
                Thread.sleep(1000)

            }catch (e:Exception){
                var message = e.message.toString()
                println(message)
                staticMessage = message
            }
        }

    }

}