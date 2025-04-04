package com.Alvin390.myapplication.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.Alvin390.myapplication.R
import com.Alvin390.myapplication.navigation.ROUTE_LOGIN
import com.Alvin390.myapplication.navigation.ROUTE_REGISTER

@Composable
fun home_screen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB2EBF2)), // Light cyan background
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center // Centers the content vertically
    ) {
        Text(
            text = "Home Screen",
            color = Color(0xFFFFD700), // Gold color
            fontSize = 34.sp,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(16.dp) // Padding around the title
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Welcome to the Home Screen",
            color = Color.White,
            fontSize = 22.sp,
            fontFamily = FontFamily.Serif,
            fontStyle = FontStyle.Normal,
            modifier = Modifier
                .background(Color(0xFF388E3C)) // Green background for the text
                .padding(8.dp)
                .fillMaxWidth()
                .wrapContentHeight()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(id = R.drawable.shadows_3),
            contentDescription = "AC Shadows Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp)
                .clip(RoundedCornerShape(12.dp)) // Rounded corners for the image
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "This is my First App. We're working on it on day three of android. Pretty cool, not going to lie. So My app is basically about the new Assassin's Creed game set in China called Assassin's Creed Shadows. It has two playable characters: A ninja and a shinobi. The Shinobi is black!",
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Italic,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = Modifier
                .background(Color(0xFFE0E0E0)) // Light gray background
                .padding(16.dp)
                .clip(RoundedCornerShape(12.dp)) // Rounded corners for text box
                .fillMaxWidth()
                .wrapContentHeight()
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { navController.navigate(ROUTE_LOGIN) },
            modifier = Modifier
                .width(300.dp)
                .height(60.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(16.dp) // Rounded corners for buttons
        ) {
            Text(
                text = "LOGIN",
                fontSize = 24.sp,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate(ROUTE_REGISTER) },
            modifier = Modifier
                .width(300.dp)
                .height(60.dp)
                .padding(8.dp),
            shape = RoundedCornerShape(16.dp) // Rounded corners for buttons
        ) {
            Text(
                text = "REGISTER",
                fontSize = 24.sp,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
private fun home_preview() {
    home_screen(rememberNavController())
}
