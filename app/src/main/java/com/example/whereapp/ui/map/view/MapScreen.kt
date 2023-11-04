package com.example.whereapp.ui.map.view

import android.annotation.SuppressLint
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapType
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState
import kotlinx.coroutines.launch

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MapScreen(navController: NavController, latitude: Double, longitude: Double, title: String) {
    val marker = LatLng(latitude, longitude)
    val properties by remember { mutableStateOf(MapProperties(mapType = MapType.NORMAL)) }
    val uiSettings by remember { mutableStateOf(MapUiSettings(zoomControlsEnabled = false)) }
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(marker, 2f)
    }
    val zoomLevel by animateFloatAsState(
        targetValue = 18.5f,
        animationSpec = tween(durationMillis = 70000, delayMillis = 5000),
        label = ""
    )
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(zoomLevel) {
        cameraPositionState.animate(CameraUpdateFactory.newLatLngZoom(marker, zoomLevel))
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = title) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) {
        Box(Modifier.fillMaxSize()) {
            GoogleMap(
                modifier = Modifier.matchParentSize(),
                properties = properties,
                uiSettings = uiSettings,
                cameraPositionState = cameraPositionState
            ) {
                Marker(position = marker, title = title)
            }

            // Botones para controlar el zoom del mapa
            Column(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 100.dp, end = 16.dp)
            ) {
                IconButton(
                    onClick = {
                        coroutineScope.launch {
                            val currentZoom = cameraPositionState.position.zoom
                            cameraPositionState.animate(CameraUpdateFactory.zoomTo(currentZoom + 1))
                        }
                    }
                ) {
                    Icon(Icons.Filled.Add, contentDescription = "Zoom in")
                }

                IconButton(
                    onClick = {
                        coroutineScope.launch {
                            val currentZoom = cameraPositionState.position.zoom
                            cameraPositionState.animate(CameraUpdateFactory.zoomTo(currentZoom - 1))
                        }
                    }
                ) {
                    Icon(Icons.Filled.Clear, contentDescription = "Zoom out")
                }
            }
        }
    }
}
