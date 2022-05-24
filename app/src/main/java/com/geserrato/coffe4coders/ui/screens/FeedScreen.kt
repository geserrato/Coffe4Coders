package com.geserrato.coffe4coders.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.geserrato.coffe4coders.ui.components.BodyText
import com.geserrato.coffe4coders.ui.components.CountryISO
import com.geserrato.coffe4coders.ui.components.ProductCard
import com.geserrato.coffe4coders.ui.components.TitleText
import com.geserrato.coffe4coders.ui.theme.Coffee4CodersTheme

@Composable
fun FeedScreen(navController: NavController) {
    val list = listOf<CountryISO>(
        CountryISO.COL, CountryISO.BRA, CountryISO.NIC, CountryISO.CRI
    )
    Coffee4CodersTheme {
        Surface(color = MaterialTheme.colors.background) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                item {
                    Column(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        TitleText(title = "Bienvenido")
                        BodyText(body = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).")
                    }
                }
                items(list) { country ->
                    ProductCard(
                        name = "Cafe",
                        summary = "Café de las montañas",
                        price = 30.5,
                        currency = "US",
                        country = country
                    ) {
                        navController.navigate("detail/${country.iso}") {
                            launchSingleTop = true
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedScreenPreview() {
    val navController = rememberNavController()
    FeedScreen(navController)
}