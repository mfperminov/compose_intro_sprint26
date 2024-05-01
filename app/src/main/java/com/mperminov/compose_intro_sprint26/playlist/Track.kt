package com.mperminov.compose_intro_sprint26.playlist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mperminov.compose_intro_sprint26.R

@Composable
fun Track() {
    Row {
        Image(
            painter = painterResource(id = R.drawable.queen_hits),
            contentDescription = "queen_greatest_hits",
            modifier = Modifier.size(56.dp)
        )
        Column {

            Text(text = "Bohemian Rhapsody")
            Text(text = "Queen")
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun TrackPreview() {
    Track()
}