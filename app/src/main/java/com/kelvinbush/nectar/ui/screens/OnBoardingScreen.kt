package com.kelvinbush.nectar.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kelvinbush.nectar.NectarScreen.Start
import com.kelvinbush.nectar.R


@Composable
fun OnBoardingScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.img), contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_carrot),
                contentDescription = "logo",
                modifier = Modifier
                    .width(49.dp)
                    .height(57.dp)
                    .padding(bottom = 6.dp)
            )
            Text(
                text = "Welcome",
                style = MaterialTheme.typography.h1
            )
            Text(text = "to our store", style = MaterialTheme.typography.h1)
            Text(
                modifier = Modifier.padding(top = 6.dp),
                text = "Get your groceries as fast as one hour",
                style = MaterialTheme.typography.h3
            )
            Spacer(
                modifier = Modifier
                    .fillMaxHeight(0.06f)
            )
            Button(
                onClick = {
                    navController.navigate(Start.name)
                },
                modifier = Modifier
                    .fillMaxWidth(0.85f)
                    .height(60.dp),
                shape = RoundedCornerShape(30)
            ) {
                Text(text = "Get Started", style = MaterialTheme.typography.button)
            }
            Spacer(
                modifier = Modifier
                    .fillMaxHeight(0.15f)
            )
        }

    }
}

