package com.example.nested_navigation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController){
    Scaffold(modifier = Modifier) {it ->
        Box(modifier = Modifier.fillMaxSize()
            .padding(it), contentAlignment = Alignment.Center) {
            Text(text = "Main Screen")
        }
    }
}