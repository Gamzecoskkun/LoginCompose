package com.example.login.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.example.login.R
import com.example.login.navigation.Screens

@Composable
fun signIn(
    navController: NavController
) {

    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(modifier = Modifier.height(100.dp))
        Text(
            text = "Lets Sign You in", style = Typography.titleLarge, fontWeight = FontWeight.Bold
        )
        Text(
            text = "Welcome Back,\nYou have been missed",
            style = Typography.titleLarge,
            fontWeight = FontWeight.Medium
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = email.value,
            onValueChange = { email.value = it },
            label = { Text("Email,phone & username") })
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = password.value,
            onValueChange = {
                password.value = it
            },
            label = { Text("Password") })
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 4.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = "Forgot Password ?", fontWeight = FontWeight.Bold
            )
        }
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                navController.navigate(Screens.SignUpScreen)
            },
        ) {
            Text("Sign In")
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            HorizontalDivider(
                Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
            )
            Text(
                text ="or", fontWeight = FontWeight.Bold
            )
            HorizontalDivider(
                Modifier
                    .weight(1f)
                    .padding(start = 8.dp)
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier.size(20.dp),
                painter = painterResource(R.drawable.ic_google),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.size(16.dp))
            Image(
                modifier = Modifier.size(20.dp),
                painter = painterResource(R.drawable.ic_facebook),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.size(20.dp))
            Image(
                modifier = Modifier.size(20.dp),
                painter = painterResource(R.drawable.ic_apple),
                contentDescription = ""
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
        ) {
            Text("Don't have an acconunt?")
            Text(
                text = "Register Now", color = Color.Blue
            )
        }
    }
}


@Composable
@Preview
fun signInPreview() {
    signIn(navController= rememberNavController())
}