package com.programmingwithahmed.composeexample1.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.programmingwithahmed.composeexample1.R

@Composable
fun CoilImageScreen() {

    val imageUrl =
        "https://st.focusedcollection.com/13735766/i/1800/focused_176558820-stock-photo-calm-mountain-lake-trees-shore.jpg"

    Column(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize()
            .padding(16.dp),
    ) {

        Box(modifier = Modifier.size(150.dp), contentAlignment = Alignment.Center) {

            AsyncImage(
                model = imageUrl,
                contentDescription = "",
                placeholder = painterResource(id = R.drawable.ic_google),
                error =  painterResource(id = R.drawable.ic_error_image),
                contentScale = ContentScale.Crop,
                modifier = Modifier.clip(CircleShape)
            )
        }


        Box(modifier = Modifier.size(150.dp), contentAlignment = Alignment.Center) {

            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(imageUrl)
                    .crossfade(3000)
                    .transformations(CircleCropTransformation())
                    .build(),
                contentDescription = "",
                placeholder = painterResource(id =R.drawable.ic_google),
                error =  painterResource(id = R.drawable.ic_error_image),
            )
        }

    }
}