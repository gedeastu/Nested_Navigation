package com.example.nested_navigation.screens

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.nested_navigation.graphs.MainNavGraph
import com.example.nested_navigation.widgets.BottomBar
import com.example.nested_navigation.widgets.SimpleLightTopAppBar

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun MainScreen(navController: NavHostController = rememberNavController()) {
    Scaffold(
        topBar = {SimpleLightTopAppBar("Nested Navigation Demo")},
        bottomBar = { BottomBar(navController = navController) }) { padding ->
        Modifier.padding(padding)
        MainNavGraph(navController = navController)
    }
}