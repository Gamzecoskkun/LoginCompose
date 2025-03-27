package com.example.login.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun signUp(
    navController: NavController,
) {
    val name = remember { mutableStateOf("") }
    val businnesName = remember { mutableStateOf("") }
    val phone = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(modifier = Modifier.height(64.dp))
        Text(
            text = "Lets Register \nAccount",
            style = Typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Hello user , you have \na greatful journey ",
            style = Typography.titleLarge,
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = name.value,
            onValueChange = { name.value = it },
            label = { Text("Name") }
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = businnesName.value,
            onValueChange = { businnesName.value = it },
            label = { Text("Buissness Name") }
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = phone.value,
            onValueChange = { phone.value = it },
            label = { Text("Phone") }
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = email.value,
            onValueChange = { email.value = it },
            label = { Text("Email") }
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = password.value,
            onValueChange = { password.value = it },
            label = { Text("Password") }
        )
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {}
        ) {
            Text(text = "Sign Up")
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Already have an account?")
            Text(text = "Login", fontWeight = FontWeight.Bold, color = Color.Blue)
        }
    }
}

@Preview
@Composable
fun signUpPreview() {
    signUp(navController = rememberNavController())
}