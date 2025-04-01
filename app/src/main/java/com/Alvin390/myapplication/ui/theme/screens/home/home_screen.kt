package com.Alvin390.myapplication.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Alvin390.myapplication.R

@Composable
fun home_screen(modifier: Modifier = Modifier) {
    Column (modifier = Modifier.run {
        fillMaxSize()
            .background(Color.Cyan)
    },
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Home Screen",
            color = Color.Yellow,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Italic
        )
        Text("Welcome to the Home Screen",
            Modifier.background(Color.Green),
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            color = Color.White)
        Text("This is the Home Screen")
        Image(painter = painterResource(id= R.drawable.ac_shadows_1),
            contentDescription = "ac_shadows",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp))

        Text("This is my First App. We're working on it on day three " +
                "of android.Pretty cool not going to lie. So My app is" +
                " basically about the new assassin's creed game set in " +
                "china called Assassin's creed shadows.It has two playable" +
                " characters.A ninja and a shinobi. The Shinobi is black !",
            Modifier.background(Color.Gray),
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Cursive,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = {/* TODO */},
            modifier = Modifier.width(300.dp)){
            Text(text="LOGIN",
                fontSize = 30.sp)}

        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = {/* TODO */},
            modifier = Modifier.width(300.dp)){
            Text(text="Register",
                fontSize = 30.sp)}

    }
}

@Preview
@Composable
private fun home_preview() {
    home_screen()

}