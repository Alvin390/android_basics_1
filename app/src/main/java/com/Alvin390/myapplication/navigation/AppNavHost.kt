package com.Alvin390.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.Alvin390.myapplication.ui.theme.screens.home.home_screen
import com.Alvin390.myapplication.ui.theme.screens.login.login_page
import com.Alvin390.myapplication.ui.theme.screens.registration.register_page

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String = ROUTE_HOME) {
    NavHost(navController=navController,
        startDestination = startDestination,
        modifier = modifier) {
         composable(ROUTE_HOME) { home_screen(navController) }
         composable(ROUTE_LOGIN) { login_page(navController) }
         composable(ROUTE_REGISTER) { register_page(navController) }
    }
}