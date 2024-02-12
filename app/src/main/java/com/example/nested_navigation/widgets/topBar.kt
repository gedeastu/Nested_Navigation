package com.example.nested_navigation.widgets

import android.app.Activity
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@ExperimentalMaterial3Api
@ExperimentalLayoutApi
@Composable
fun SimpleLightTopAppBar(title: String) {

    val act = LocalContext.current as Activity
    TopAppBar(
        title = {
            Text(title, style = MaterialTheme.typography.titleMedium)
        },
        navigationIcon = {
            IconButton(onClick = {
                act.finish()
            }) {
                Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Back")
            }
        },
        actions = {
            IconButton(onClick = { /* doSomething() */ }) {
                Icon(imageVector = Icons.Filled.Notifications, contentDescription = "Search")
            } },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(3.dp)
        )

    )
}