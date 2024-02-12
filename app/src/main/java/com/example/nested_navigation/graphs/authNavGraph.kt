package com.example.nested_navigation.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nested_navigation.screens.authScreens.ForgotPasswordScreen
import com.example.nested_navigation.screens.authScreens.LoginScreen
import com.example.nested_navigation.screens.authScreens.RegistrationScreen
import com.example.nested_navigation.screens.authScreens.SplashScreen

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.AUTHENTICATION,
        startDestination = AuthScreen.SPLASH.route
    ){
        composable(route = AuthScreen.SPLASH.route){
            SplashScreen(navController = navController)
        }
        composable(route = AuthScreen.Login.route){
            LoginScreen(navController = navController)
        }
        composable(route = AuthScreen.Registration.route){
            RegistrationScreen(navController = navController)
        }
        composable(route = AuthScreen.ForgotPassword.route){
            ForgotPasswordScreen(navController = navController)
        }
    }
}

sealed class AuthScreen(val route : String){
    data object SPLASH : AuthScreen("SPLASH")
    data object Login : AuthScreen("LOGIN")
    data object Registration : AuthScreen("REGISTRATION")
    data object ForgotPassword : AuthScreen("FORGOT-PASSWORD")
}