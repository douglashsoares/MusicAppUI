package com.example.musicappui.ui

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicappui.R

@Composable
fun BrowserScreen(){
    val browserCategories = listOf("Hits", "Happy", "Workout", "Running", "Yoga","TGIF")

    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(browserCategories){
            BrowserItem(
                cat = it,
                drawable = R.drawable.ic_browser
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun  BrowserBottomPreview (){
    BrowserScreen()
}