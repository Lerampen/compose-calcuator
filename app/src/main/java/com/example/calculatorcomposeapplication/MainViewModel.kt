package com.example.calculatorcomposeapplication

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.core.text.isDigitsOnly
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private  val _textFieldValue = mutableStateOf("")
    val textFieldValue : State<String> = _textFieldValue

    fun clear(){
        //   Add a functionality that clears the digit or operator that was last added to the screen
        _textFieldValue.value = _textFieldValue.value.dropLast(1)
    }
    fun clearEverything(){
        //  Add a functionality that clears everything that is on the screen
        /**
         * when the clear button is clicked everything on the screen should be cleared
         */
        _textFieldValue.value = ""

    }

    // Add a functionality where a digit/number is added on the screen when the digit buttons are clicked
    fun appendDigit(digit : String){
        _textFieldValue.value += digit
    }

//  Add a functionality to add an operator when the operator button is clicked
//  also when the operator button is clicked it should not allow
//  the operator to be put twice or thrice e.g. +++ or -- e

    fun appendOperator(operator: String){
        if (canAppendOperator()){
            _textFieldValue.value += operator
        }
    }
//    check if the operator can be appended
    private fun canAppendOperator():Boolean{

        val textInput = _textFieldValue.value
//    It allows appending if the text  ends with a digit, or ends with a decimal point
        return textInput.last().isDigit() || textInput.endsWith(".")

    }

    //  Add a functionality that performs arithmetic when the equals button "=" is clicked
    fun evaluateExpression(){
        try {
           val expression = _textFieldValue.value
            var result = 0.0 // initialize result


            if (expression.contains("+")){
                val parts = expression.split("+") //split based on the + operator

//            perform addition

                for (part in parts) {
                    result += part.toDouble()
                }

                _textFieldValue.value = result.toString()
            }

            else if (expression.contains("-")){
                val parts = expression.split("-")

//                perform subtraction
                for (part in parts){
                    result -= part.toDouble()
                }
                _textFieldValue.value = result.toString()
            }

            else if (expression.contains("*")){
                val parts = expression.split("*")

//                perform multiplication
                for (part in parts){
                    result *= part.toDouble()
                }
                _textFieldValue.value = result.toString()
            }

            else if (expression.contains("/")){
                val parts = expression.split("/")

//                perform division
                for (part in parts){
                    result /= part.toDouble()
                }
                _textFieldValue.value = result.toString()
            }

        } catch(e: ArithmeticException){
            e.printStackTrace()

        }
    }

}