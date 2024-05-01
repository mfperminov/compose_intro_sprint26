package com.mperminov.compose_intro_sprint26.playlist

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mperminov.compose_intro_sprint26.R

val tracks = listOf(
    TrackUiState(
        "Queen",
        "Bohemian Rhapsody",
        R.drawable.queen_hits
    ),
    TrackUiState(
        "Queen",
        "Another One Bites the Dust»",
        R.drawable.queen_hits
    ),
    TrackUiState(
        "Queen",
        "Killer Queen",
        R.drawable.queen_bohemian
    ),
    TrackUiState(
        "Queen",
        "Fat Bottomed Girls",
        R.drawable.queen_hits
    ),
    TrackUiState(
        "Queen",
        "Bicycle Race",
        R.drawable.queen_bohemian
    ),
    TrackUiState(
        "Queen",
        "You’re My Best Friend",
        R.drawable.queen_hits
    ),
    TrackUiState(
        "Queen",
        "Spread Your Wings",
        R.drawable.queen_hits
    ),
    TrackUiState(
        "Queen",
        "Don’t Stop Me Now",
        R.drawable.queen_bohemian
    ),
    TrackUiState(
        "Queen",
        "Save Me",
        R.drawable.queen_bohemian
    ),
    TrackUiState(
        "Queen",
        "Crazy Little Thing Called Love",
        R.drawable.queen_hits
    ),
)

@Composable
fun TrackList(tracks: List<TrackUiState>) {
    Column {
        tracks.forEach { trackUiState ->
            Track(trackUiState = trackUiState)
        }
    }
}

@Preview(showSystemUi = true, showBackground = true, backgroundColor = 0xFFCDDC39)
@Composable
private fun TrackListPreview() {
    TrackList(tracks = tracks)
}