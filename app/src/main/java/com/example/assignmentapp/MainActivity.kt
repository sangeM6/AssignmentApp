package com.example.assignmentapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignmentapp.ui.theme.AssignmentAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AssignmentAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DailySuggestor(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@Composable
fun DailySuggestor(modifier: Modifier = Modifier) {
    var userInput by remember { mutableStateOf("") }
    var suggestionMessage by remember {mutableStateOf("")}
    var errorMessage by remember {mutableStateOf("")}

    Column(
        modifier = modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        //User Input Text Field
        OutlinedTextField(
            value = userInput,
            onValueChange = {
                userInput =it
                errorMessage =" "
            },
            label = {Text ("Time of Day")},
            placeholder = {Text("morning, mid-morning,afternoon,etc.")},
            isError = errorMessage.isNotEmpty(),
            modifier = Modifier.fillMaxWidth()
        )
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AssignmentAppTheme {
        Greeting("Android")
    }
}