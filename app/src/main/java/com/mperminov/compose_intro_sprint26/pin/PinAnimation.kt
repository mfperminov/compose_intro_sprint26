package com.mperminov.compose_intro_sprint26.pin

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun PinAnimation() {
    var pinCode by remember { mutableStateOf("") }
    if (pinCode.length > 10) pinCode = ""

    // make it null to disable
    var autoMode: Boolean? by remember { mutableStateOf(true) }

    if (autoMode == true) {
        LaunchedEffect(Unit) {
            delay(1000)
            pinCode += "1"
            delay(800)
            pinCode += "2"
            delay(750)
            pinCode += "3"
            delay(500)
            pinCode += "4"
            delay(220)
            pinCode += "5"
            delay(200)
            pinCode += "6"
            delay(300)
            delay(400)
            pinCode += "7"
            delay(150)
            pinCode += "8"
            delay(120)
            pinCode += "9"
        }
    }

    Column(Modifier.padding(16.dp)) {
        Row(
            Modifier
                .height(150.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.Center
        ) {
            pinCode.forEachIndexed { index, char ->
                val animationState =
                    remember { MutableTransitionState(false) }.also { it.targetState = true }
                AnimatedVisibility(
                    visibleState = animationState,
                    enter = scaleIn() + expandHorizontally()
                ) {
                    Text(
                        text = char.toString(),
                        fontSize = 60.sp,
                    )
                }
            }
        }
        PinPad(
            onClick = {
//                pinCode += pinCode.lastOrNull()?.digitToInt()?.plus(1) ?: '1'
                if (autoMode == null) {
                    pinCode += it
                } else {
                    autoMode = true
                }
            },
            Modifier
                .padding(top = 100.dp)
                .fillMaxWidth()
//                .aspectRatio(1.33f),
        )
    }
}

@Composable
internal fun PinPad(onClick: (Char) -> Unit, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.SpaceEvenly, modifier = modifier) {
        repeat(3) { outer ->
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                repeat(3) { inner ->
                    val char = (outer * 3 + inner + 1).digitToChar()
                    IconButton(onClick = { onClick(char) }, modifier = Modifier.size(100.dp)) {
                        Text(text = char.toString(), fontSize = 40.sp)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun PinAnimationPreview() {
    MaterialTheme {
        PinAnimation()
    }
}