package com.mperminov.compose_intro_sprint26.playlist

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mperminov.compose_intro_sprint26.R

data class TrackUiState(
    val artist: String,
    val title: String,
    @DrawableRes val imageResId: Int,
)


@Composable
fun Track(trackUiState: TrackUiState) {
    Row(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = trackUiState.imageResId),
            contentDescription = "queen_greatest_hits",
            modifier = Modifier
                .size(56.dp)
                .clip(RoundedCornerShape(4.dp))
        )
        Column(
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(1f),
            verticalArrangement = Arrangement.Center,
        ) {
            Text(text = trackUiState.title, fontSize = 16.sp)
            Text(
                text = trackUiState.artist,
                fontSize = 14.sp,
                color = Color.Black.copy(alpha = 0.5f)
            )
        }
        IconButton(onClick = {}) {
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrackPreview() {
    Track(TrackUiState("Queen", "Bohemian Rhapsody", R.drawable.queen_hits))
}