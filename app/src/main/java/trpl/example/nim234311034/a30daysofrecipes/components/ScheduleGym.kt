package trpl.example.nim234311034.a30daysofrecipes.components

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import trpl.example.nim234311034.a30daysofrecipes.R
import trpl.example.nim234311034.a30daysofrecipes.data.ScheduleData

@Composable
fun ScheduleGym(schedule: ScheduleData) {
    var isExpanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .animateContentSize(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        onClick = { isExpanded = !isExpanded }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text =  stringResource(id = schedule.dateRes),
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.height(8.dp))

            Image(
                painter = painterResource(id = schedule.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = stringResource(id = schedule.titleRes),
                style = MaterialTheme.typography.headlineSmall
            )

            Spacer(modifier = Modifier.height(4.dp))

            if (isExpanded) {
                Text(
                    text = stringResource(id = schedule.descriptionRes),
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRecipeCard() {
    val exampleSchedule = ScheduleData(
        dateRes = R.string.date1,
        titleRes = R.string.title1,
        descriptionRes = R.string.description1,
        imageRes = R.drawable.dy1
    )
    ScheduleGym(schedule = exampleSchedule)
}