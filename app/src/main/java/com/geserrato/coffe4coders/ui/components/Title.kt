package com.geserrato.coffe4coders.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.geserrato.coffe4coders.ui.theme.Coffee4CodersTheme

@Composable
fun TitleText(title: String) {
    Text(title, style = MaterialTheme.typography.h3)
}

@Preview(showBackground = true)
@Composable
fun TitleTextPreview() {
    Coffee4CodersTheme {
        TitleText("Title")
    }
}