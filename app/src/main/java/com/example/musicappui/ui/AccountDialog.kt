package com.example.musicappui.ui

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material.TextField
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties

@Composable
fun AccountDialog(dialogOpen: MutableState<Boolean>) {
    if (dialogOpen.value) {
        AlertDialog(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(MaterialTheme.colors.primarySurface),
            title = { Text(text = "Adicionar Conta") },
            onDismissRequest = {
                dialogOpen.value = false
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        dialogOpen.value = false
                    }) {
                    Text(text = "Confirmar")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        dialogOpen.value = false
                    }) {
                    Text(text = "Cancelar")
                }
            },
            text = {
                Column(
                    modifier = Modifier
                        .wrapContentHeight()
                        .padding(top = 16.dp)
                ) {
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .padding(top = 16.dp),
                        label = {
                            Text(text = "Email")
                        }
                    )
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .padding(top = 8.dp),
                        label = {
                            Text(text = "Senha")
                        }
                    )
                }
            },
            shape = RoundedCornerShape(5.dp),
            backgroundColor = Color.White,
            properties = DialogProperties(
                dismissOnBackPress = true,
                dismissOnClickOutside = true
            )
        )
    }
}