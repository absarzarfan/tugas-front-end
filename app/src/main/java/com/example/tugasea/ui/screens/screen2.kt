package com.example.tugasea.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Screen2(navController: NavController) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.padding(16.dp)
    ) {
        items(10) { index ->
            GridItem(index, onClick = {
                navController.navigate("detail/$index")
            })
        }
    }
}

@Composable
fun GridItem(index: Int, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable(onClick = onClick)
    ) {
        Text("Item $index", modifier = Modifier.padding(16.dp))
    }
}

@Composable
fun Screen2Preview() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.padding(16.dp)
    ) {
        items(10) { index ->
            GridItem(index, onClick = {})
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewScreen2() {
    Screen2Preview()
}
