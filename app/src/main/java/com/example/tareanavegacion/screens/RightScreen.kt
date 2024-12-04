package com.example.tareanavegacion.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.navigation.NavHostController

@Composable
fun RightScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Magenta),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Volver", modifier = Modifier.clickable {
            //TODO
            navController.popBackStack()
        })
    }
}