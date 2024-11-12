package com.example.tugasea.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasea.R
import com.example.tugasea.ui.components.BottomNavBar
import com.example.tugasea.ui.components.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    Scaffold(
        topBar = {
            TopBar(
                title = "Layar Utama",
                showBackButton = false,
                onBackClick = {},
                searchQuery = "",
                onSearchQueryChanged = {}
            )
        },
        bottomBar = {
            BottomNavBar()
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp) // Padding di dalam konten
        ) {
            // Judul bagian
            Text(
                text = "Selamat Datang, Absar!",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Card pertama untuk fitur/opsi
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFE8E8E8)) // Warna abu muda
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Gambar atau ikon
                    Image(
                        painter = painterResource(id = R.drawable.ikan), // Ganti dengan ikon yang sesuai
                        contentDescription = "Fitur 1",
                        modifier = Modifier.size(80.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Fitur 1", style = MaterialTheme.typography.bodyMedium)
                }
            }

            // Card kedua untuk fitur/opsi
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFE8E8E8))
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Gambar atau ikon
                    Image(
                        painter = painterResource(id = R.drawable.ikan), // Ganti dengan ikon yang sesuai
                        contentDescription = "Fitur 2",
                        modifier = Modifier.size(80.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Fitur 2", style = MaterialTheme.typography.bodyMedium)
                }
            }

            // Anda bisa menambahkan lebih banyak card atau elemen lain sesuai dengan kebutuhan
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}
