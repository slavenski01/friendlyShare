package com.example.friendlyshare

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.friendlyshare.data.AppContainer
import com.example.friendlyshare.ui.FriendlyShareTheme

@Composable
fun MainFriendlyShareApp(
    appContainer: AppContainer
) {
    FriendlyShareTheme {
        val darkIcons = MaterialTheme.colors.isLight

        val navController = rememberNavController()
        val navigationActions = remember(navController) {
        }

        val coroutineScope = rememberCoroutineScope()

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute =
            navBackStackEntry?.destination?.route
    }
}