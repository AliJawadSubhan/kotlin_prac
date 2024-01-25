package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
//import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import com.example.greetingcard.ui.theme.GreetingCardTheme
import com.example.greetingcard.ui.theme.HappyBirthdayTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingCardText(message = "Happy Birthday Ali", from = "Ibrahim")
                }
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Surface(color = Color.Cyan) {
//        Text(
//            text = "Hello, My name is $name!",
//            fontSize = 21.sp,
//            color = Color.Black,
//            fontWeight = FontWeight.Bold,
//            modifier = modifier.padding(21.dp)
//        )
//    }
//}

//@Preview(showBackground = true, name = "This is a preview", showSystemUi = true)
//@Composable
//fun GreetingPreview() {
//    GreetingCardTheme {
//            Surface(modifier = Modifier.fillMaxSize()) {
//                Greeting("Ibrahim")
//            }
//
//    }
//}


@Composable
fun GreetingCardText(modifier: Modifier = Modifier, message: String, from: String) {
    Column  (
        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Ho.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(4.dp)){
        Text(
            text = "$message",
            fontSize = 89.sp,
            lineHeight = 116.sp,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = "$from",
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End),
            fontSize = 36.sp
        )
    }
}


@Preview(showBackground = true, name = "Birthday card", showSystemUi = true )
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
//            Greeting(name = "Ali jawad")
        GreetingCardText(message = "Happy Birthday Ali", from = "Ibrahim")
    }
}




@Composable
fun GreetingCardImage(modifier: Modifier = Modifier) {
    Image(painter = image),
}
