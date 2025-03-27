package com.example.login.navigation

import kotlinx.serialization.Serializable

sealed class Screens{
    @Serializable
    data object SignInScreen

    @Serializable
    data object  SignUpScreen
}
