package com.example.nested_navigation.graphs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarNavGraph(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object Home : BottomBarNavGraph(
        route = "HOME",
        title = "HOME",
        icon = Icons.Default.Home
    )

    data object Profile : BottomBarNavGraph(
        route = "PROFILE",
        title = "PROFILE",
        icon = Icons.Default.Person
    )

    data object Settings : BottomBarNavGraph(
        route = "SETTINGS",
        title = "SETTINGS",
        icon = Icons.Default.Settings
    )
}