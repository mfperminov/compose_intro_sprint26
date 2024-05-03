package com.mperminov.compose_intro_sprint26.material

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val LocalLuckyNumber = compositionLocalOf { 0 }

@Composable
private fun Number() {
    Text(text = LocalLuckyNumber.current.toString())
}

@Preview
@Composable
private fun AmbientPreview() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .background(Color.White)
                .padding(8.dp)
        ) {
            Column {
                Number()
                CompositionLocalProvider(LocalLuckyNumber provides 42) {
                    Number()
                }
            }
        }
    }
}