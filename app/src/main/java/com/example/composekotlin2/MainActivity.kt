package com.example.composekotlin2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composekotlin2.ui.theme.ComposeKotlin2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeKotlin2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background

                ) {
                    Row(Modifier.fillMaxSize(), Arrangement.Center, Alignment.Top,)
                    {
                        Column(Modifier.background(MaterialTheme.colors.error).width(0.dp),
                            verticalArrangement = Arrangement.Top)
                        {

                        }
                    }

                }

            }
        }
    }
}


@Composable
fun MainUI() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeKotlin2Theme {

    }
}