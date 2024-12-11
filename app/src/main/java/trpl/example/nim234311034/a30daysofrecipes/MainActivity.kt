package trpl.example.nim234311034.a30daysofrecipes
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import trpl.example.nim234311034.a30daysofrecipes.ui.theme.ScheduleListScreen
import trpl.example.nim234311034.a30daysofrecipes.ui.theme._30DaysOfRecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DaysOfRecipesTheme(
                darkTheme = false
            ) {
                Surface(color = MaterialTheme.colorScheme.background) {
                    _30DaysOfRecipes()
                }
            }
        }
    }
}

@Composable
fun _30DaysOfRecipes() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar()
        }
    ) { paddingValues ->
        ScheduleListScreen(contentPadding = paddingValues)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "30 Days of Recipes",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )
        },
        modifier = modifier,
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    )
}


@Preview(showBackground = true)
@Composable
fun RecipeListScreenPreview() {
    _30DaysOfRecipesTheme {
        _30DaysOfRecipes()
        }
}