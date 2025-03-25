package com.example.dogprofilepage

import android.graphics.Color
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Composable
fun ProfilePage() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    )
    {
        Image(
            painter = painterResource(id = R.drawable.dog),
            contentDescription = "Slika psa",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(
                    width = 2.dp,
                    color = androidx.compose.ui.graphics.Color.Red,
                    shape = CircleShape
                ),
            contentScale = ContentScale.Crop
        )

        Text(text = "Belgijski ovcar")
        Text(text = "Belgija")

        Row (
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ){
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "150", fontWeight = FontWeight.Bold)
                Text(text = "Pratitelja")
            }

            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "100", fontWeight = FontWeight.Bold)
                Text(text = "Prati")
            }

            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "15", fontWeight = FontWeight.Bold)
                Text(text = "Objava")
            }
        }

    }
}



@Preview(showBackground = true)
@Composable
fun ProfilePagePreview(){
    ProfilePage()
}

