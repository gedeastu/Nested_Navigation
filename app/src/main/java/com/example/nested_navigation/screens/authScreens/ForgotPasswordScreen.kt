package com.example.nested_navigation.screens.authScreens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ForgotPasswordScreen(navController: NavController){
    Box(modifier = Modifier.fillMaxSize(),contentAlignment = Alignment.Center) {
        Column {
            Text(text = "Forgot Password Screen")
            Button(
                onClick = {
                    // Perform forgot password logic here
                    // For simplicity, navigate back to Login screen
                    navController.popBackStack()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "Reset Password")
            }
        }
    }
}