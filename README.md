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

## Screenshot
[App Screenshot](drawable/app_image.png)

## Video 
Watch the app in action:
[Daily Suggester App](https://youtube.com/shorts/4Hx1AfAo5KA?feature=share)

## GitHub Usage
GitHub was used to store and save the project online and track changes made.
Commits were also made to save progress and for someone viewing the code to see see changes made or added information and also to not get confused.

## GitHub Actions
GitHub Actions were used to check for failures ,successes or errors of the code.
Created a workflow to run when code is pushed, helping to check if the project builds successfully.

## To Run The Application
- Open the project in Android Studio.
- Run the app on the emulator or Android device.

## Author
ZUSANGE MBALEKI

## References
Android Developers.(2025) *Create a button |Jetpack Compose*.[online] Available at: https://developer.android.com/develop/ui/compose/quick-guides/content/create-button (Accessed: 30 March 2026).
Android Developers.(2025) *Configure text fields|Jetpack Compose*.[online] Available at: https://developer.com/develop/i//compose/text/user-input?textfield=state-based (Accessed: 30 March 2026).
Android Developer.(2024) *Text Field and Outlined text Field in Jetpack Compose*.[YouTube] Available at:https://youtu.be/Ye9oK6cMPQk?si=STrxucp3pdPkn3yb (Accessed: 30 march 2026).
Google AI.(2026) Google AI [online] Available at:https://ai.google/ (Accessed: 30 march 2026).
Masked Programmer.(2025) *Add your First Button in Android Studio|Jetpack Compose made Simple!*.[YouTube] Available at:https://youtu.be/UkxX6RbhNVI?si=_e95dAyE4npHEHEA (Accessed 30 March 2026).


