package com.example.musicappui

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import com.example.musicappui.Screen.DrawerScreen



sealed class Screen(
    val title: String,
    val route: String,
) {
    sealed class BottomScreen(
        val bTitle: String,
        val bRoute: String,
        @DrawableRes val icon: Int
    ): Screen(
        bTitle,
        bRoute
    ){
        object Home: BottomScreen(
            bTitle = "Home",
            bRoute = "home",
            icon = R.drawable.ic_home
        )

        object Browser: BottomScreen(
            bTitle = "Browser",
            bRoute = "browser",
            icon = R.drawable.ic_browser
        )
        object Library: BottomScreen(
            bTitle = "Library",
            bRoute = "library",
            icon = R.drawable.ic_video_library
        )

    }

    sealed class DrawerScreen(
        val dTitle: String,
        val dRoute: String,
        @DrawableRes val icon: Int
    ) : Screen(
        dTitle,
        dRoute
    ) {
        object Account : DrawerScreen(
            "Perfil",
            "account",
            R.drawable.ic_account
        )

        object Subscription : DrawerScreen(
            "Inscrições",
            "subscribe",
            R.drawable.ic_subscribe
        )

        object AddAccount : DrawerScreen(
            "Adicionar Conta",
            "add_account",
            R.drawable.baseline_person_add_alt_1_24
        )
    }
}

val screensInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Browser,
    Screen.BottomScreen.Library

)

val screensInDrawer = listOf(
    DrawerScreen.Account,
    DrawerScreen.Subscription,
    DrawerScreen.AddAccount
)