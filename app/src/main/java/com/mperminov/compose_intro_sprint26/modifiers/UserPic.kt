package com.mperminov.compose_intro_sprint26.modifiers

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.mperminov.compose_intro_sprint26.R
import com.mperminov.compose_intro_sprint26.ui.theme.AppTheme

@Composable
private fun Image(modifier: Modifier = Modifier) {
    Image(
        painter = rememberDrawablePainter(LocalContext.current.getDrawable(R.drawable.ic_user_avatar4)),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier
    )
}


@Composable
private fun UserPic() {
    val gradient = Brush.horizontalGradient(
        .344f to Color(0xFF5351DE),
        .6611f to Color(0xFFC047B9),
        .9637f to Color(0xFFFAA630)
    )
    Row {
        Image(
            modifier = Modifier
                .clickable { }
                .padding(16.dp)
                .border(2.dp, gradient, CircleShape)
                .border(4.dp, Color.White, CircleShape)
                .clip(CircleShape)
        )
    }
}

@Preview(device = "id:Nexus 5X", showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun UserPicPreview() {
    AppTheme {
        UserPic()
    }
}