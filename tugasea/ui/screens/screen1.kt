package com.example.tugasea.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Screen1(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("List Column", style = MaterialTheme.typography.headlineSmall)
        LazyColumn {
            items(10) { index ->
                ListItem(index, onClick = {
                    navController.navigate("detail/$index")
                })
            }
        }
    }
}

@Composable
fun ListItem(index: Int, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = onClick)
    ) {
        Text("Item $index", modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewScreen1() {
    Screen1Preview()
}

@Composable
fun Screen1Preview() {
    TODO("Not yet implemented")
}
