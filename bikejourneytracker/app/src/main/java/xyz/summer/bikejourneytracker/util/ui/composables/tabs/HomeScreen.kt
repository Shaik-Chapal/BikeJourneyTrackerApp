package xyz.summer.bikejourneytracker.util.ui.composables.tabs

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemContentType
import androidx.paging.compose.itemKey
import xyz.summer.bikejourneytracker.R
import xyz.summer.bikejourneytracker.presentation.activity.MainActivity
import xyz.summer.bikejourneytracker.presentation.component.CardStation
import xyz.summer.bikejourneytracker.presentation.component.ProgressBarCenter
import xyz.summer.bikejourneytracker.presentation.screen.MapActivity
import xyz.summer.bikejourneytracker.presentation.theme.TextPrimary
import xyz.summer.bikejourneytracker.presentation.theme.TextSecondary
import xyz.summer.bikejourneytracker.presentation.viewmodel.StationListViewModel

/**
 * Composable function that represents the home screen of the application.
 */
@Composable
fun HomeScreen(snackbar: SnackbarHostState = remember { SnackbarHostState() },
               viewmodel: StationListViewModel = hiltViewModel(),

) {
    val beers = viewmodel.beers.collectAsLazyPagingItems()
    val context = LocalContext.current

    LaunchedEffect(key1 = beers.loadState) {
        val state = beers.loadState.refresh
        if (state is LoadState.Error) snackbar.showSnackbar(state.error.message ?: "")
    }

    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackbar) { data ->
                Snackbar(snackbarData = data)
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),

            ) {
        Header("Station List")
        LazyColumn(
            contentPadding = padding,
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            if (beers.loadState.prepend == LoadState.Loading) {
                item {
                    ProgressBarCenter()
                }
            }

            items(
                count = beers.itemCount,
                key = beers.itemKey(
                    key = { beer -> beer.fid }
                ),
                contentType = beers.itemContentType()
            ) { index ->
                val beer = beers[index]
                if (beer != null) CardStation(beer = beer) {
                   // String() tt: (beer: StationModel) -> String = { beer -> "${beer.x},${beer.y}" }

//                    vl.setData(tt.toString())
//                    navController.navigate(NavPath.HOMEMAP.toString())
                    //context.startActivity(Intent(context, MapActivity::class.java))
                    val intent = Intent(context, MapActivity::class.java)
                    intent.putExtra("list", "${beer.x},${beer.y}")
                    context.startActivity(intent)
                    Log.d("dd","${beer.x},${beer.y}")




                }
            }

            when (val append = beers.loadState.append) {
                LoadState.Loading -> item {
                    ProgressBarCenter()
                }

                is LoadState.Error -> item {
                    LaunchedEffect(key1 = append) {
                        snackbar.showSnackbar(append.error.message ?: "")
                    }
                }

                else -> Unit
            }
        }}
    }
}



@Composable
fun Header(s: String) {
    Column(
        modifier = Modifier.padding
            (bottom = 20.dp, top = 20.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(

                    style = TextStyle(fontWeight = FontWeight.Bold),
                    text = s,
                    color = TextSecondary,
                    fontSize = 20.sp,
                )
            }

        }
        var text by remember { mutableStateOf(TextFieldValue("")) }
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
                .clip(RoundedCornerShape(10.dp)),
            placeholder = { Text(text = "Search by $s", color = TextSecondary) },
            maxLines = 1,
            leadingIcon = {
                Icon(
                    Icons.Default.Search,
                    contentDescription = "",
                    tint = TextSecondary,
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                textColor = TextPrimary,

                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )
    }

}
@Composable
fun Navbar(context:Context) {
    Row(
        Modifier
            .fillMaxWidth().background(color = Color.Cyan)
            .padding(10.dp)
        ,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painterResource(id= R.drawable.ic_back_arrow),
            contentDescription = "back_button",
            modifier = Modifier
                .size(32.dp)
                .clickable {
                    val intent = Intent(context, MainActivity::class.java)

                    context.startActivity(intent)
                }
        )
        Text(
            text = "Station",
            color = Color.White,
            fontSize = 20.sp,
            style = TextStyle(fontWeight = FontWeight.Bold, color = Color.White),
        )
        Text(
            text = "          ",
            color = TextPrimary,
            fontSize = 18.sp,
        )

    }
}
@Composable
fun HeaderS(s: String) {
    Column(
        modifier = Modifier.padding
            (bottom = 20.dp, top = 20.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(

                    style = TextStyle(fontWeight = FontWeight.Bold),
                    text = s,
                    color = TextSecondary,
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp,
                )
            }

        }

    }

}