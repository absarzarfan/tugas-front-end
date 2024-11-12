package com.example.tugasea.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasea.R
import com.example.tugasea.ui.components.BottomNavBar
import com.example.tugasea.ui.components.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AboutScreen() {
    Scaffold(
        topBar = {
            TopBar(
                title = "Tentang",
                showBackButton = true,  // Tambahkan jika ingin tombol kembali
                onBackClick = { /* Back action */ },
                searchQuery = "",
                onSearchQueryChanged = {}
            )
        },
        bottomBar = {
            BottomNavBar()
        }
    ) { paddingValues ->  // Menggunakan paddingValues untuk menyesuaikan konten dengan padding default
        // Column utama
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues) // Memastikan padding yang tepat dengan paddingValues dari Scaffold
                .padding(16.dp), // Padding ekstra di dalam konten
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Card dengan warna abu muda
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp), // Membuat sudut melengkung lebih besar
                colors = CardDefaults.cardColors(containerColor = Color(0xFFE8E8E8)) // Warna abu muda #E8E8E8
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp) // Padding di dalam Card
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally // Memastikan gambar tetap di tengah
                ) {
                    // Gambar di tengah dan bulat dengan bayangan
                    Image(
                        painter = painterResource(id = R.drawable.check),
                        contentDescription = "Profile Image",
                        modifier = Modifier
                            .size(120.dp) // Ukuran gambar lebih besar
                            .clip(CircleShape) // Membuat gambar bulat
                            .shadow(8.dp, shape = CircleShape) // Memberikan bayangan pada gambar
                            .align(Alignment.CenterHorizontally) // Memastikan gambar di tengah
                    )
                    Spacer(modifier = Modifier.height(16.dp)) // Spasi antara gambar dan teks

                    // Divider untuk pemisah
                    Divider(
                        modifier = Modifier.padding(vertical = 8.dp),
                        color = Color(0xFFBDBDBD), // Warna divider lebih lembut
                        thickness = 1.dp
                    )

                    // Kolom untuk teks di bawah gambar, dengan teks rata kiri
                    Column(
                        horizontalAlignment = Alignment.Start, // Mengubah teks menjadi rata kiri
                        modifier = Modifier.fillMaxWidth() // Memastikan kolom memenuhi lebar
                    ) {
                        // Nama, Email, Asal Universitas, dan Jurusan dengan style yang lebih menarik
                        Text(
                            text = "Nama: Absar Rakha Zarfan",
                            style = MaterialTheme.typography.bodyMedium.copy(color = Color(0xFF333333)),
                            modifier = Modifier.padding(vertical = 4.dp)
                        )
                        Text(
                            text = "Email: absaraltamerano@gmail.com",
                            style = MaterialTheme.typography.bodyMedium.copy(color = Color(0xFF333333)),
                            modifier = Modifier.padding(vertical = 4.dp)
                        )
                        Text(
                            text = "Asal Universitas: Politeknik Negeri Batam",
                            style = MaterialTheme.typography.bodyMedium.copy(color = Color(0xFF333333)),
                            modifier = Modifier.padding(vertical = 4.dp)
                        )
                        Text(
                            text = "Jurusan: Teknik Informatika",
                            style = MaterialTheme.typography.bodyMedium.copy(color = Color(0xFF333333)),
                            modifier = Modifier.padding(vertical = 4.dp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAboutScreen() {
    AboutScreen()
}
