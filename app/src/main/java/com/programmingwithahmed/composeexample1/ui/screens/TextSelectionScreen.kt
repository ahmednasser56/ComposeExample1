package com.programmingwithahmed.composeexample1.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.programmingwithahmed.composeexample1.R

@Composable
fun TextSelectionScreen() {
    SelectionContainer {
        Column(
            modifier = Modifier
                .fillMaxSize(),
        ) {
            Text(text = stringResource(id = R.string.i_love_android))
            DisableSelection {
                Text(text = stringResource(id = R.string.i_love_android))
            }
            Text(text = stringResource(id = R.string.i_love_android))
        }

    }
}