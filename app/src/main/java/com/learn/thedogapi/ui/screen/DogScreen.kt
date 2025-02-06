package com.learn.thedogapi.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter

@OptIn(ExperimentalCoilApi::class)
@Composable
fun DogScreen(viewModel: DogViewModel= androidx.lifecycle.viewmodel.compose.viewModel()){
    val dogImage by viewModel.dogImage
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { viewModel.fetchRandomDog() }) {
            Text("Get Dog")
        }

        Spacer(modifier = Modifier.height(16.dp))

        dogImage?.let {
            Image(
                painter = rememberImagePainter(it),
                contentDescription = "dog",
                modifier = Modifier.size(250.dp)
            )
        }
    }
}