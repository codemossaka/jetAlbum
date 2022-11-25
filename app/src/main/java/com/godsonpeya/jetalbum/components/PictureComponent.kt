package com.godsonpeya.jetalbum.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun PictureComponent(@DrawableRes image: Int, onPictureClicked: () -> Unit) {
    Box(modifier = Modifier
        .padding(5.dp)
        .clickable { onPictureClicked.invoke() },
        contentAlignment = Alignment.Center) {
        Image(painter = painterResource(id = image),
            contentDescription = "image fleur",
            modifier = Modifier.size(190.dp))
    }
}
