package com.example.musicappui.ui

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicappui.R

@Composable
fun SubscriptionView() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(text = "Manage Subscription")

        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            elevation = 4.dp
        ) {
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Column(
                        modifier = Modifier
                            .padding(start = 8.dp),

                    ) {
                        Text(text = "Musical")
                        Text(text = "Free Tier")
                    }

                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        TextButton(
                            onClick = {
                                //ToDo Navegar para a Pagina de Planos
                            },
                        ) {
                            Text(
                                text = "See All Plans",
                                color = MaterialTheme.colors.primary,
                                fontSize = 14.sp,
                                textDecoration = TextDecoration.Underline
                            )
                        }
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = "Arrow right",
                            tint = MaterialTheme.colors.primary
                        )
                    }

                }
                Divider(thickness = 1.dp, modifier = Modifier.padding(horizontal = 8.dp))

                Row(
                    modifier = Modifier
                        .padding(vertical = 16.dp),
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_account),
                        contentDescription = "" +
                                "Account Plan"
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 8.dp),
                        text = "Get a Plan"
                    )

                }
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun SubscriptionViewPreview() {
    SubscriptionView()
}
