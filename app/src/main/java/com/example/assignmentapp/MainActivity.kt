package com.example.assignmentapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.assignmentapp.ui.theme.AssignmentAppTheme
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.material3.*

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
            label = {Text ("Enter time of day")},
            placeholder = {Text("morning, mid-morning,afternoon,etc.")},
            isError = errorMessage.isNotEmpty(),
            modifier = Modifier.fillMaxWidth()
        )
        //Error message display (if-Else)
        if (errorMessage.isNotEmpty()) {
            Text(
                text = errorMessage,
                color =MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(top = 4.dp).align(Alignment.Start)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            //Submit button with if-else logic
            Button(onClick = {
                val input = userInput.lowercase().trim()

                if (input == "morning") {
                    suggestionMessage = "Send a 'Good morning' text to a family member."
                    errorMessage =""
                }else if (input == "mid-morning") {
                    suggestionMessage = "Reach out to a colleague with a quick 'Thank you'."
                    errorMessage = ""
                }else if (input == "afternoon") {
                    suggestionMessage = "Share a funny meme or interesting link with a friend."
                    errorMessage =""
                }else if (input == "afternoon snack time") {
                    suggestionMessage ="Send a quick 'thinking of you' message."
                    errorMessage =""
                }else if (input == "evening") {
                    suggestionMessage = "Better start cooking."
                    errorMessage =""
                }else if (input == "dinner"){
                    suggestionMessage ="Call a friend or relative for a 5-minute catch up."
                    errorMessage =""
                }else if (input == "after dinner") {
                    suggestionMessage = "Leave a thoughtful comment on a friend's post."
                }else {
                    suggestionMessage =""
                    errorMessage = "Error: Enter morning, mid-morning,afternoon ,afternoon snack time, etc."
                }
            }) {
                Text("Submit")
            }
        }
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