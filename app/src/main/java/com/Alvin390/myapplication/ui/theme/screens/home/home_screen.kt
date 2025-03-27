package com.Alvin390.myapplication.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun home_screen(modifier: Modifier = Modifier) {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Home Screen",
            color = Color.Yellow,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive)
        Text("Welcome to the Home Screen",
            Modifier.background(Color.Green),
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            color = Color.White)
        Text("This is the Home Screen")

    }
}

@Preview
@Composable
private fun home_preview() {
    home_screen()

}