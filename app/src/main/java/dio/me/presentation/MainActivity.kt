package dio.me.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.pm.ShortcutInfoCompat.Surface
import dagger.hilt.android.AndroidEntryPoint
import dio.me.data.model.Response
import dio.me.presentation.components.AppTopBar
import dio.me.presentation.theme.SantanderDevWeekTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SantanderDevWeekTheme {
                MainApp()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainApp(response: Response? = null) =
    Surface(color = MaterialTheme.colorScheme.background) {
        Scaffold(
            topBar = { AppTopBar() },
            content = { innerPadding ->

            }

        ) {

        }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SantanderDevWeekTheme {
        MainApp()
    }
}
