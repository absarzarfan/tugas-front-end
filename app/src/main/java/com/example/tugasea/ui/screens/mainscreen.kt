package com.example.tugasea.ui.screens

<<<<<<< HEAD
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
=======
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.tugasea.ui.components.BottomNavigationBar
import com.example.tugasea.ui.navigation.NavigationItem
>>>>>>> b87eb60b2f07c305f7a6ed10dd77896c4863e1d9

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
<<<<<<< HEAD
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
=======
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        topBar = { TopAppBar(title = { Text("My Application") }) },
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        // Displaying content based on the current route
        MainContent(currentRoute, Modifier.padding(innerPadding), navController)
    }
}

@Composable
fun MainContent(currentRoute: String?, modifier: Modifier, navController: NavController) {
    Column(modifier = modifier) {
        when (currentRoute) {
            NavigationItem.Screen1.route -> {
                Text("This is Screen 1")
            }
            NavigationItem.Screen2.route -> {
                Text("This is Screen 2")
            }
            NavigationItem.Screen3.route -> {
                Text("This is the About Screen")
            }
            "detail/{itemId}" -> {
                val itemId = navController.previousBackStackEntry
                    ?.arguments?.getString("itemId") ?: ""
                Text("Detail Screen for item: $itemId")
            }
            else -> {
                Text("Home Screen")
            }
>>>>>>> b87eb60b2f07c305f7a6ed10dd77896c4863e1d9
        }
    }
}

@Preview(showBackground = true)
@Composable
<<<<<<< HEAD
fun MainScreenPreview() {
    MainScreen()
=======
fun PreviewMainScreen() {
    MainScreenPreview()
}

@Composable
fun MainScreenPreview() {
    TODO("Not yet implemented")
>>>>>>> b87eb60b2f07c305f7a6ed10dd77896c4863e1d9
}
