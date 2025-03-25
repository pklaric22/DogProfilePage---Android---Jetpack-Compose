package com.example.dogprofilepage

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfilePage() {
    Column {
        Image(
            painter = painterResource(id = R.drawable.dog),
            contentDescription = "Slika psa"
        )
        Text(text="Belgijski ovcar")
        Text(text="Belgija")
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePagePreview(){
    ProfilePage()
}

