package com.mperminov.compose_intro_sprint26.playlist

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Track() {
    Text(text = "Bohemian Rhapsody")
    Text(text = "Queen")
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrackPreview() {
    Track()
}