package com.Alvin390.myapplication.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.Alvin390.myapplication.model.DashboardStat
import com.Alvin390.myapplication.model.QuickAction
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DashboardViewModel:ViewModel (){
    val _stats= MutableStateFlow(
        listOf(
            DashboardStat("Revenue", "12000", Icons.Default.Phone, Color.Magenta),
            DashboardStat("User", "1456", Icons.Default.Person, Color.Cyan),
        )
            )
    val stats:StateFlow<List<DashboardStat>>get() = _stats
    private val _quickAction= MutableStateFlow(
        listOf(
            QuickAction("Add New User",Icons.Default.Person),
            QuickAction("Generate Report",Icons.Default.AccountCircle),
            QuickAction("Settings",Icons.Default.Settings),

        )
    )
    val quickAction:StateFlow<List<QuickAction>>get() = _quickAction
}