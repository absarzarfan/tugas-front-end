package com.example.tugasea.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasea.R
import com.example.tugasea.ui.components.BottomNavBar
import com.example.tugasea.ui.components.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(itemId: String, onBackClick: () -> Unit = {}) {
    Scaffold(
        topBar = {
            TopBar(
                title = "Detail Item",
                showBackButton = true,  // Menampilkan tombol kembali
                onBackClick = { onBackClick() },  // Menangani aksi kembali
                searchQuery = "",
                onSearchQueryChanged = {}
            )
        },
        bottomBar = {
            BottomNavBar()  // Menambahkan navigasi bawah
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp), // Padding utama untuk konten
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Menampilkan gambar besar item
            Image(
                painter = painterResource(id = R.drawable.ikan), // Ganti dengan gambar yang sesuai
                contentDescription = "Item Image",
                modifier = Modifier
                    .size(200.dp) // Ukuran gambar besar
                    .clip(RoundedCornerShape(16.dp)) // Membuat gambar dengan sudut melengkung
                    .padding(bottom = 16.dp) // Padding bawah
            )

            // Teks judul item
            Text(
                text = "Item Detail: $itemId", // Menampilkan ID item sebagai judul
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Teks deskripsi
            Text(
                text = "This is the detailed description of item $itemId. Here you can provide more information about the item, its features, and other relevant details that the user should know.",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Tombol aksi, misalnya untuk menghubungi atau melihat informasi lebih lanjut
            Button(
                onClick = { /* Handle action here */ },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF177BCD)) // Mengubah warna tombol
            ) {
                Text("Action Button")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(itemId = "1")
}
