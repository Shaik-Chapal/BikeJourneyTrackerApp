package xyz.summer.bikejourneytracker.presentation.screen

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.view.ViewCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import xyz.summer.bikejourneytracker.presentation.theme.TextSecondary
import xyz.summer.bikejourneytracker.util.ui.composables.tabs.Navbar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable

fun GoogleMapMultipleMarker(viewModel: String) {
    val mapview = rememberMapViewWithLifeCycle()
    val context = LocalContext.current
    Scaffold(


    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 0.dp),

            ) {
            Navbar(context = context );
            DetailsItems()
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                AndroidView(
                    { mapview }
                ) { mapView ->
                    CoroutineScope(Dispatchers.Main).launch {
                        mapView.getMapAsync { googleMap ->
                            googleMap.mapType = 1
                            googleMap.uiSettings.isZoomControlsEnabled = true
                            val values: List<String> = viewModel.split(",")

                            val latitude: Double = values[0].trim().toDouble()
                            val longitude: Double = values[1].trim().toDouble()

                            val mark1 = LatLng(latitude, longitude) //Hyd

                            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mark1, 6f))
                            val markerOption = MarkerOptions()
                                .title("")
                                .position(mark1)

                            googleMap.addMarker(markerOption)
                        }
                    }
                }
            }
        }}
    }
}

@Composable
fun DetailsItems() {
    Box(
        Modifier
            .fillMaxWidth()


            .padding(horizontal = 20.dp, vertical = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Starting from the station",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = TextSecondary,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "20",
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = TextSecondary,
                    fontSize = 14.sp,
                )
            }
        }
    }
}

@Composable
fun rememberMapLifeCycleObserver(
    mapView: MapView
): LifecycleEventObserver = remember(mapView) {
    LifecycleEventObserver { _, event ->
        when (event) {
            Lifecycle.Event.ON_CREATE -> mapView.onCreate(Bundle())
            Lifecycle.Event.ON_START -> mapView.onStart()
            Lifecycle.Event.ON_RESUME -> mapView.onResume()
            Lifecycle.Event.ON_PAUSE -> mapView.onPause()
            Lifecycle.Event.ON_STOP -> mapView.onStop()
            Lifecycle.Event.ON_DESTROY -> mapView.onDestroy()
            else -> throw IllegalStateException()
        }
    }
}

@Composable
fun rememberMapViewWithLifeCycle(): MapView {
    val context = LocalContext.current
    val mapView = remember {
        MapView(context).apply {
            id =  ViewCompat.generateViewId()
        }
    }

    val lifecycleObserver = rememberMapLifeCycleObserver(mapView = mapView)
    val lifecycle = LocalLifecycleOwner.current.lifecycle
    DisposableEffect(lifecycle) {
        lifecycle.addObserver(lifecycleObserver)
        onDispose {
            lifecycle.removeObserver(lifecycleObserver)
        }
    }

    return mapView
}