package com.rururi.codextestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rururi.codextestapp.ui.GameScreen
import com.rururi.codextestapp.ui.GameUiState
import com.rururi.codextestapp.ui.theme.CodexTestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodexTestAppTheme {
                GameScreen(state = GameUiState(), modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CodexTestAppTheme {
        GameScreen(state = GameUiState(), modifier = Modifier.fillMaxSize())
    }
}

