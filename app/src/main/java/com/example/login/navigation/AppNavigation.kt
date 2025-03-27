package com.example.login.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.login.navigation.Screens.SignInScreen
import com.example.login.ui.theme.signIn
import com.example.login.ui.theme.signUp

@Composable
fun AppNavigation(){
    val navController= rememberNavController()

    NavHost(
        navController=navController,
        startDestination = Screens.SignInScreen
    ){
        composable <Screens.SignInScreen>{
            signIn(navController)
        }
        composable <Screens.SignUpScreen>{
            signUp(navController)
        }
    }
}