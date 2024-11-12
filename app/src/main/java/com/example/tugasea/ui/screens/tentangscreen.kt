package com.example.tugasea.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasea.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AboutScreen() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("About Me") }) }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ikan),
                contentDescription = "Profile Image"
            )
            Text("Nama: [Nama Anda]")
            Text("Email: [Email Anda]")
            Text("Asal Universitas: [Universitas Anda]")
            Text("Jurusan: [Jurusan Anda]")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAboutScreen() {
    AboutScreen()
}
