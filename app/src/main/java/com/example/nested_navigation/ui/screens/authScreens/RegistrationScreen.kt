package com.example.nested_navigation.ui.screens.authScreens

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
import com.example.nested_navigation.graphs.AuthScreen
import com.example.nested_navigation.graphs.Graph

@Composable
fun RegistrationScreen(navController: NavController){
    Box(modifier = Modifier.fillMaxSize(),contentAlignment = Alignment.Center) {
        Column {
            Text(text = "Registration Screen")
            Button(
                onClick = {
                    navController.navigate(Graph.MAIN_SCREEN_PAGE) {
                        popUpTo(AuthScreen.Registration.route) { inclusive = true }
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "Register")
            }
        }

    }
}