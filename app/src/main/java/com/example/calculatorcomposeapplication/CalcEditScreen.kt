package com.example.calculatorcomposeapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalcEditScreen() {

    Box(modifier = Modifier
        .fillMaxWidth()
        .height(200.dp)
        .padding(4.dp)
        .background(
            color = Color(0xFFE5F0F7),
            shape = RoundedCornerShape(size = 30.dp)
        )
    ) {

      TextField(
          value = "0",
          onValueChange ={},
          modifier = Modifier
              .align(Alignment.BottomEnd),
          // TODO: change the color of the container

      )
    }
}

@Preview(showBackground = true)
@Composable
fun EditScreenPreview() {
    CalcEditScreen()
}