package com.example.emoapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()
        }
    }
}

@Composable
fun Text() {
    Column (modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current

        androidx.compose.material3.Text(
            text = "Welcome to android",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )
        androidx.compose.material3.Text(
            text = "There is Android",
            fontSize = 29.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline
        )
        androidx.compose.material3.Text(
            text = "1. Kotlin"
        )
        androidx.compose.material3.Text(
            text = "2. Java"
        )
        androidx.compose.material3.Text(
            text = "3. Python"
        )

        Spacer(modifier = Modifier.height(20.dp))
        Divider()

        Box(modifier = Modifier.fillMaxWidth())

        Image(painter = painterResource(id = R.drawable.dog),
                contentDescription = "Lion",
                modifier = Modifier.size(200.dp))

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = { mContext.startActivity(Intent(mContext,Layout::class.java)) },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp))
            {
                androidx.compose.material3.Text(text = "Continue")
            }
        Spacer(modifier = Modifier.width(40.dp))
        Row {
            Button(
                onClick = { mContext.startActivity(Intent(mContext, DestinationActivity::class.java)) },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue)
            )
            {
                androidx.compose.material3.Text(text = "Destination")
                Spacer(modifier = Modifier.width(40.dp))
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    tint = Color.White
                )
            }

        }
    }
}
@Preview(showBackground = true)
@Composable
fun TextPreview() {
    Text()
}