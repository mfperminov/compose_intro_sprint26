package com.mperminov.compose_intro_sprint26

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mperminov.compose_intro_sprint26.playlist.TrackList
import com.mperminov.compose_intro_sprint26.playlist.tracks
import com.mperminov.compose_intro_sprint26.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TrackList(tracks = tracks)
                }
            }
        }
    }
}

private val practicumRoles = listOf("mentor", "curator", "reviewer")

@Composable
fun RolesWidget(
    roles: List<String>,
    modifier: Modifier = Modifier,
    headerText: String = "We have",
) {
    Column(modifier = modifier) {
        Text(text = headerText)
        roles.forEach { role ->
            Text(text = role)
        }
    }
}

@Composable
fun NaiveRolesWidget(
    roles: List<String>,
    modifier: Modifier = Modifier,
    headerText: String = "We have",
) {
    Text(text = headerText)
    roles.forEach { role ->
        Text(text = role)
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NaiveRolesWidgetPreview() {
    AppTheme {
        NaiveRolesWidget(practicumRoles)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RolesWidgetPreview() {
    AppTheme {
        RolesWidget(practicumRoles)
    }
}
