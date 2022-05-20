package com.geserrato.coffe4coders.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.geserrato.coffe4coders.ui.theme.Coffee4CodersTheme

@Composable
fun BodyText(body: String) {
    Text(
        body, style = MaterialTheme.typography.body2,
        textAlign = TextAlign.Justify
    )
}

@Preview(showBackground = true)
@Composable
fun BodyTextPreview() {
    Coffee4CodersTheme {
        BodyText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.")
    }
}