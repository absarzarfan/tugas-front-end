package com.example.tugasea.ui.screens

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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
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
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    MainScreenPreview()
}

@Composable
fun MainScreenPreview() {
    TODO("Not yet implemented")
}
