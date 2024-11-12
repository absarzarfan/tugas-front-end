package com.example.tugasea.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.tugasea.ui.navigation.NavigationItem

// BottomNavigationBar.kt
@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        NavigationItem.Screen1,
        NavigationItem.Screen2,
        NavigationItem.Screen3
    )
    BottomNavigation {
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                selected = false,
                onClick = {
                    navController.navigate(item.route)
                }
            )
        }
    }
}

@Composable
fun BottomNavigationItem(
    icon: @Composable () -> Unit,
    label: @Composable () -> Unit,
    selected: Boolean,
    onClick: () -> Unit
) {
    TODO("Not yet implemented")
}

@Composable
fun BottomNavigation(content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}
