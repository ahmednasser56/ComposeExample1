package com.programmingwithahmed.composeexample1.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.programmingwithahmed.composeexample1.R

@Composable
fun PasswordTextFieldScreen() {

    Column(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize()
            .padding(16.dp),
    ) {

        var passwordState by remember { mutableStateOf("") }
        var passwordVisibilityState by remember { mutableStateOf(false) }

        val icon = if (passwordVisibilityState)
            painterResource(id = R.drawable.ic_eye)
        else
            painterResource(id = R.drawable.ic_eye_off)

        OutlinedTextField(
            value = passwordState, onValueChange = { passwordState = it },
            label = { Text(text = "Password") },
            trailingIcon = {
                IconButton(onClick = { passwordVisibilityState = !passwordVisibilityState }) {
                    Icon(painter = icon, contentDescription = "Eye Icon")
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = if (passwordVisibilityState) VisualTransformation.None
            else PasswordVisualTransformation()
        )
    }
}