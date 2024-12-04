package com.example.tareanavegacion

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tareanavegacion.screens.DownScreen
import com.example.tareanavegacion.screens.InitScreen
import com.example.tareanavegacion.screens.LeftScreen
import com.example.tareanavegacion.screens.RightScreen
import com.example.tareanavegacion.screens.UpScreen

@Composable
fun NavHostController() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "init"){
        composable("init",
            ){InitScreen(navController)}

        composable ("up",
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Down,
                    animationSpec = tween(700)
                )
            }
            ){UpScreen(navController)}

        composable ("left",
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(700)
                )
            }
            ){LeftScreen(navController)}

        composable ("right",
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)
                )
            }
            ){RightScreen(navController)}

        composable ("down",
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Up,
                    animationSpec = tween(700)
                )
            }
            ){DownScreen(navController)}
    }
}