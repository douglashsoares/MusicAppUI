package com.example.musicappui

import androidx.annotation.DrawableRes
import com.example.musicappui.Screen.DrawerScreen

sealed class Screen(
    val title: String,
    val route: String,
) {
    sealed class DrawerScreen(
        val dTitle: String,
        val dRoute: String,
        @DrawableRes val icon: Int
    ) : Screen(dTitle, dRoute) {
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

val screensInDrawer = listOf(
    DrawerScreen.Account,
    DrawerScreen.Subscription,
    DrawerScreen.AddAccount
)