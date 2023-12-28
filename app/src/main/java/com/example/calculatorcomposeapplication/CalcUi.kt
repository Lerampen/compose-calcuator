package com.example.calculatorcomposeapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalcButtons(
    text : String,
    onClick:() -> Unit,
    modifier: Modifier,


) {
    Button(
        onClick = onClick,
        modifier = modifier
            .width(80.dp)
            .height(80.dp),
        shape = RoundedCornerShape(17.dp),
        colors = ButtonDefaults.outlinedButtonColors(Color(0xFFFFD8DF))
    ) {
        Text(
            text = text,
            modifier = modifier
                .width(53.dp)
                .height(50.dp),
            style = TextStyle(
                fontSize = 48.sp,
                fontFamily = FontFamily.Monospace,
                fontStyle = FontStyle.Italic,
                color = Color.Black)
        )
    }
    




    

}