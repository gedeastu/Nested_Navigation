package com.example.nested_navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.nested_navigation.screens.ScreenContent

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

//this is multiple nested
fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.DETAILS,
        startDestination = DetailsScreen.BTM_DETAIL_PAGE.route
    ) {
        composable(route = DetailsScreen.BTM_DETAIL_PAGE.route) {
            ScreenContent(name = "Detail Page") {
                navController.navigate(DetailsScreen.BTM_SUB_DETAILS_PAGE.route)
            }
        }
        composable(route = DetailsScreen.BTM_SUB_DETAILS_PAGE.route) {
            ScreenContent(name = "Sub Detail Page") {}
        }
    }
}


sealed class DetailsScreen(val route: String) {
    data object BTM_DETAIL_PAGE : DetailsScreen(route = "DETAIL_PAGE_")
    data object BTM_SUB_DETAILS_PAGE : DetailsScreen(route = "DETAIL_PAGE_SUB")
}