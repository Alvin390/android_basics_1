package com.Alvin390.myapplication.ui.theme.screens.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MenuDefaults.containerColor
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Alvin390.myapplication.data.DashboardViewModel
import com.Alvin390.myapplication.model.DashboardStat
import com.Alvin390.myapplication.model.QuickAction




@Composable
fun Dashboard_Screen (viewModel: DashboardViewModel=androidx.lifecycle.viewmodel.compose.viewModel()) {
    val stats by viewModel.stats.collectAsState()
    val action by viewModel.quickAction.collectAsState()

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = "Welcome to the Dashboard",
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
            )
            Spacer(modifier = Modifier.height(20.dp))


            StatsSection(stats)

            Spacer(modifier = Modifier.height(20.dp))

            QuickActions(actions = action)
        }
    }
}



            @Composable
            fun StatsSection(stats: List<DashboardStat>) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    modifier= Modifier.fillMaxWidth()
                ) {
                    stats.forEach{
                        StatCard(it)
                    }
                }

            }

@Composable
fun StatCard(stat: DashboardStat) {

    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
//            .fillMaxWidth()
//            .weight(1f)
            .height(120.dp),
        colors = CardDefaults.cardColors(containerColor = stat.background)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(stat.icon, contentDescription = stat.title, tint = Color.Black)
            Column {
                Text(text = stat.title, fontSize = 14.sp, color = Color.DarkGray)
                Text(text = stat.value, fontWeight = FontWeight.Bold, fontSize = 18.sp)
            }
        }
    }
}
            @Composable
            fun QuickActions(actions: List<QuickAction>) {
                Text(
                    text = "Quick Actions",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    actions.forEach {actions ->
                        ActionItem(actions)
                    }
                }
            }

            @Composable
            fun ActionItem(action: QuickAction) {
                Card(
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                ) {
                    Row(
                        modifier = Modifier
                            .padding(16.dp),
                    ) {
                        Icon(action.icon, contentDescription = action.title, tint = Color.Black)
                        Text(text = action.title, fontSize = 16.sp)
                    }
                }
            }


@Preview
@Composable
private fun dash_prev() {
    Dashboard_Screen()

}


