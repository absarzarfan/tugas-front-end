package com.example.tugasea.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector

private val Icons.Filled.GridView: ImageVector
    get() {
        TODO("Not yet implemented")
    }

sealed class NavigationItem(var route: String, var title: String, var icon: ImageVector) {
    object Screen1 : NavigationItem("screen1", "List Column/Row", Icons.Filled.List)
    object Screen2 : NavigationItem("screen2", "List Grid", Icons.Filled.GridView)
    object Screen3 : NavigationItem("screen3", "About", Icons.Filled.Info)
}