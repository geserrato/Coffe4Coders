package com.geserrato.coffe4coders.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.geserrato.coffe4coders.ui.components.CountryISO

@Composable
fun DetailScreen(navController: NavController, countryISO: CountryISO) {
    Column() {
        Text("Soy un producto de: ${countryISO.iso}", style = MaterialTheme.typography.h3)
        Button(onClick = {
            navController.navigate("feed"){
                popUpTo("feed")
            }
        }) {
            Text(text = "Volver")
        }
    }
}