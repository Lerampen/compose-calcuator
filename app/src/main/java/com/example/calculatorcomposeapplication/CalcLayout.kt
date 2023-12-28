package com.example.calculatorcomposeapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CalcLayout() {
val calcViewModel : MainViewModel = viewModel()
Column(modifier = Modifier.fillMaxSize()) {

    CalcEditScreen()
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        CalcButtons(text = "7", onClick = { calcViewModel.appendDigit("7") }, modifier = Modifier)
        CalcButtons(text = "8", onClick = {  calcViewModel.appendDigit("8") }, modifier = Modifier)
        CalcButtons(text = "9", onClick = {  calcViewModel.appendDigit("9") }, modifier = Modifier)
        CalcButtons(text = "+", onClick = { calcViewModel.appendOperator("+") }, modifier = Modifier)

    }
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        CalcButtons(text = "4", onClick = {  calcViewModel.appendDigit("4") }, modifier = Modifier)
        CalcButtons(text = "5", onClick = {  calcViewModel.appendDigit("5") }, modifier = Modifier)
        CalcButtons(text = "6", onClick = {  calcViewModel.appendDigit("6") }, modifier = Modifier)
        CalcButtons(text = "-", onClick = { calcViewModel.appendOperator("-") }, modifier = Modifier)

    }

    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        CalcButtons(text = "1", onClick = {  calcViewModel.appendDigit("1") }, modifier = Modifier)
        CalcButtons(text = "2", onClick = {  calcViewModel.appendDigit("2") }, modifier = Modifier)
        CalcButtons(text = "3", onClick = {  calcViewModel.appendDigit("3") }, modifier = Modifier)
        CalcButtons(text = "*", onClick = { calcViewModel.appendOperator("*") }, modifier = Modifier)

    }
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {

        CalcButtons(text = "0", onClick = {  calcViewModel.appendDigit("0") }, modifier = Modifier)
        CalcButtons(text = "C", onClick = { calcViewModel.clear() }, modifier = Modifier)
        CalcButtons(text = ".", onClick = { calcViewModel.appendOperator(".") }, modifier = Modifier)
        CalcButtons(text = "/", onClick = { calcViewModel.appendOperator("/") }, modifier = Modifier)

    }
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        CalcButtons(text = "CE", onClick = { calcViewModel.clearEverything() }, modifier = Modifier)
        CalcButtons(text = "(", onClick =  {  calcViewModel.appendDigit("(") }, modifier = Modifier)
        CalcButtons(text = ")", onClick =   {  calcViewModel.appendDigit(")") }, modifier = Modifier)
        CalcButtons(text = "=", onClick = { calcViewModel.evaluateExpression() }, modifier = Modifier)


    }
}//End of the column
}

@Preview(showBackground = true)
@Composable
fun CalcPreview() {
    CalcLayout()
}