package com.godsonpeya.jetalbum.navigation

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.godsonpeya.jetalbum.screens.DetailScreen
import com.godsonpeya.jetalbum.screens.HomeScreen

@Composable
fun MyAlbumNavigation(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = AppScreen.HomeScreen.name) {
        composable(route = AppScreen.HomeScreen.name) {
            HomeScreen(navController = navHostController)
        }
        composable(route = AppScreen.DetailScreen.name + "/{id}") { entry ->
            val id = entry.arguments?.getString("id")!!.toInt()
            DetailScreen(navController = navHostController, id = id)
        }

    }

}