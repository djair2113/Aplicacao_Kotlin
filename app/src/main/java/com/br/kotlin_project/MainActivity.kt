package com.br.kotlin_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.br.kotlin_project.ui.theme.Kotlin_projectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Greeting("Android")
                Aplicacao()

            }



                }
            }
        }



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = " $name!",
        modifier = modifier
    )
}

@Composable
fun Aplicacao(){
    Text("Arroz")
    Text("Feijão")
    Text("Oleo")
    Text("Frutas")
    Text("Legumes")
    Text("Leite")
    Text("Macarrão")
    Text("Sorvete")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Kotlin_projectTheme {
        Greeting("Android")
    }
}