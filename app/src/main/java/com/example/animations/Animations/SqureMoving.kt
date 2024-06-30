package com.example.animations.Animations

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity


@Composable
fun ContinuouslyMovingSquaresAnimation() {
    val infiniteTransition = rememberInfiniteTransition(label = "")
    val screenWidthPx = with(LocalDensity.current) { LocalConfiguration.current.screenWidthDp.dp.toPx() }

    val translation by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = screenWidthPx,
        animationSpec = infiniteRepeatable(
            animation = tween(4000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ), label = ""
    )

    Box(
        contentAlignment = Alignment.CenterStart,
        modifier = Modifier.fillMaxSize()
    ) {
        for (i in 0..3) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .graphicsLayer(
                        translationX = translation
                    )
                    .background(Color.Red)
            )
        }
    }
}
