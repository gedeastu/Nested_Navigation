package com.example.nested_navigation.routes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarRoutes(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object Home : BottomBarRoutes(
        route = "HOME",
        title = "HOME",
        icon = Icons.Default.Home
    )

    data object Profile : BottomBarRoutes(
        route = "PROFILE",
        title = "PROFILE",
        icon = Icons.Default.Person
    )

    data object Settings : BottomBarRoutes(
        route = "SETTINGS",
        title = "SETTINGS",
        icon = Icons.Default.Settings
    )
}