package com.Alvin390.myapplication.ui.theme.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.Alvin390.myapplication.R
import com.Alvin390.myapplication.navigation.ROUTE_HOME
import kotlinx.coroutines.delay

@Composable
fun splash_screen(navController: NavHostController) {
//    val NavController= rememberNavController()
    LaunchedEffect(Unit) {
        delay(3000)
        navController.navigate(ROUTE_HOME)
    }
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize())
    {
        Image(
            painter = painterResource(id = R.drawable.ac_splash),
            contentDescription = "Splash Screen",
            modifier = Modifier.size(150.dp) // Adjust size as needed
        )
    }

    }