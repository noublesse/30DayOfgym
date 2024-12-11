package trpl.example.nim234311034.a30daysofrecipes.ui.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import trpl.example.nim234311034.a30daysofrecipes.model.Schedule
import trpl.example.nim234311034.a30daysofrecipes.components.ScheduleGym

@Composable
fun ScheduleListScreen(contentPadding: PaddingValues) {
    LazyColumn(
        contentPadding = contentPadding
    ) {
        items(Schedule.schedule) { recipe ->
            ScheduleGym(schedule = recipe)
        }
    }
}