package com.example.animations.Animations



import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay


@Composable
fun BallBounce() {
    MaterialTheme {
        BouncingBallAnimation()
    }
}

@Composable
fun BouncingBallAnimation() {
    val ballSize = 50.dp
    val ballColor = Color.Red
    val ballRadius = ballSize / 2

    var ballPosition by remember { mutableStateOf(0f) }
    var direction by remember { mutableStateOf(1) }
    val coroutineScope = rememberCoroutineScope()
    val bounceHeight = 300f

    LaunchedEffect(key1 = true) {
        while (true) {
            ballPosition += direction * 5
            if (ballPosition >= bounceHeight || ballPosition <= 0) {
                direction *= -1
            }
            delay(4L)
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.size(ballSize)) {
            drawRoundRect(
                color = ballColor,
                topLeft = Offset(0f, ballPosition),
                size = Size(ballSize.toPx(), ballSize.toPx()),
                cornerRadius = CornerRadius(ballRadius.toPx(), ballRadius.toPx())
            )
        }
    }
}
