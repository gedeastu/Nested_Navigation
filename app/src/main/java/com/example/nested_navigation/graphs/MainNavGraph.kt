package com.example.nested_navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.nested_navigation.ui.screens.ScreenContent

@Composable
fun MainNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomBarNavGraph.Home.route, route = Graph.MAIN_SCREEN_PAGE){
        homeNavGraph(navController = navController)
        profileNavGraph(navController = navController)
        settingsNavGraph(navController = navController)

        //Multiple Nested
        detailsNavGraph(navController = navController)
    }
}

fun NavGraphBuilder.homeNavGraph(navController: NavHostController){
    composable(route = BottomBarNavGraph.Home.route) {
        ScreenContent(
            name = BottomBarNavGraph.Home.route,
            onClick = {
                navController.navigate(Graph.DETAILS)
            }
        )
    }
}

fun NavGraphBuilder.profileNavGraph(navController: NavHostController){
    composable(route = BottomBarNavGraph.Profile.route) {
        ScreenContent(
            name = BottomBarNavGraph.Profile.route,
            onClick = {
                navController.navigate(Graph.DETAILS)
            }
        )
    }
}

fun NavGraphBuilder.settingsNavGraph(navController: NavHostController){
    composable(route = BottomBarNavGraph.Settings.route) {
        ScreenContent(
            name = BottomBarNavGraph.Settings.route,
            onClick = {
                navController.navigate(Graph.DETAILS)
            }
        )
    }
}
