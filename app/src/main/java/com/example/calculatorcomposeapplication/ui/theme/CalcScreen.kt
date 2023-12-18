package com.example.calculatorcomposeapplication.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.calculatorcomposeapplication.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditScreen() {
    


    Row(modifier = Modifier
        .width(388.dp)
        .height(388.dp)
        .background(
            color = colorScheme.primary,
            shape = RoundedCornerShape(size = 30.dp)
        )
    ) {

    TextField(
        value = "0" ,
        onValueChange = {} ,
        modifier = Modifier
            .fillMaxWidth()
            .height(IntrinsicSize.Max),

    )
        

}

}

@Preview
@Composable
fun EditPreview() {
    EditScreen()


}

@Composable
fun NumbersonScreen() {
//    var customcolor = colorResource(id = R.color.primary_pink)
//
//    MaterialTheme(
//        colorScheme = colorScheme.copy(
//            primary = customcolor
//        )
//    ){
        Column(
            modifier = Modifier
            .fillMaxWidth()
                .background(Color(0XFFFFFFFFFF))

        ) {


            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Button(
                    onClick = { /*TODO*/ },
                       modifier = Modifier
                           .width(80.dp)
                           .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))


                ) {
                    Text(
                        text = "7",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)
                        )

                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                ) {
                    Text(
                        text = "8",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)

                        )
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                    ) {
                    Text(
                        text = "9",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)
                        )
                    )
                }

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                ) {
                    Text(
                        text = "+",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)
                        )
                    )
                }
            }

            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                ) {
                    Text(
                        text = "4",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)

                        )

                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))

                    ) {
                    Text(
                        text = "5",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)

                        )

                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                    ) {
                    Text(
                        text = "6",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)

                        )
                    )
                }

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                ) {
                    Text(
                        text = "-",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)
                        )
                    )
                }

            }

            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            ) {

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                ) {
                    Text(
                        text = "1",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)
                        )

                        )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                    ) {
                    Text(
                        text = "2",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)
                        )
                        )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                    ) {
                    Text(
                        text = "3",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)
                        )
                        )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                ) {
                    Text(
                        text = "*",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)
                        )
                    )
                }
            }



            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))) {
                    Text(
                        text = "0",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)
                        )
                        )


                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                ) {
                    Text(
                        text = "C",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)
                        )
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                ) {
                    Text(
                        text = ".",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)
                        )
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(80.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                ) {
                    Text(
                        text = "/",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)
                        )
                    )
                }
            }

            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(185.dp)
                        .height(80.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors( Color(0xFFFFD8DF))
                ) {
                    Text(
                        text = "=",
                        modifier = Modifier
                            .width(53.dp)
                            .height(50.dp),
                        style = TextStyle(
                            fontSize = 48.sp,
                            fontFamily = FontFamily.Monospace,
                            fontWeight = FontWeight(300),
                            fontStyle = FontStyle.Italic,
                            color = Color(0XFF000000)
                        )
                    )
                }
            }

        }

    }



    
//}

@Preview(showbackground = true)
@Composable
fun NumbersOnScreenPreview() {
    NumbersonScreen()
    
}