package xyz.summer.bikejourneytracker.util.nav

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search

sealed class NavItem {
    object Home :
        Item(path = NavPath.HOME.toString(), title = NavTitle.HOME, icon = Icons.Default.Home)

    object Search :
        Item(path = NavPath.SEARCH.toString(), title = NavTitle.SEARCH, icon = Icons.Default.Search)

    object List :
        Item(path = NavPath.LIST.toString(), title = NavTitle.LIST, icon = Icons.Default.List)
    object HOMEMAP :
        Item(path = NavPath.HOMEMAP.toString(), title = NavTitle.HOMEMAP, icon = Icons.Default.List)


}