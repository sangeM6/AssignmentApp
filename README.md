# Daily Suggester Application Report

## Description
This Android Application was built using Kotlin and Jetpack Compose.
The application asks for the time of day from the user, checks if the input is valid or not and provides feedback based on it.

## Purpose of the Application
The purpose of this app is to allow users to enter login details and check if the information is correct.
This application was created to practice conditional statements, input validation, and basic Android development.

## Features
- Allows the user to enter the time of the day.
- Validates the user input before submitting.
- Displays an error message for incorrect input or an empty input.
- Submit button to process user input.
- Reset button to clear all input fields for an easy re-entry.
- Provides a simple and user-friendly interface.

## Design Considerations
This application was designed to be simple ,easy to use and easy to understand.
Provides clear input fields and buttons to help guide the user when or while using the app.
Provides a quick feedback when incorrect input is entered, improving user experience.

## Technologies Used
- Kotlin
- Android Studio
- Jetpack Compose

## Code Example
if (errorMessage.isNotEmpty()) {
            Text(
                text = errorMessage,
                color =MaterialTheme.colorScheme.error,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(top = 4.dp).align(Alignment.Start)
            )
        }
This code snippet checks if 'errorMessage' is true or false and if it is true it will display the error message.
Change the color to error that is red and the body to be small just below the input field.
