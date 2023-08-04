package xyz.summer.bikejourneytracker.util.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.List
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.material.icons.rounded.Place

sealed class NavItem {
    object Home :
        Item(path = NavPath.HOME.toString(), title = "Station", icon = Icons.Rounded.LocationOn)

    object Search :
        Item(path = NavPath.SEARCH.toString(), title = "Top List", icon = Icons.Default.Star)

    object List :
        Item(path = NavPath.LIST.toString(), title = "Journey", icon = Icons.Rounded.List)
    object HOMEMAP :
        Item(path = NavPath.HOMEMAP.toString(), title = NavTitle.HOMEMAP, icon = Icons.Default.Star)



}